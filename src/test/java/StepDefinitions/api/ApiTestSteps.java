package StepDefinitions.api;

import Utils.PayloadUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class ApiTestSteps extends PayloadUtil {
    HttpClient httpClient;
    int id = 888;
    String name = "Leyla";
    String status = "available";
    URIBuilder uri;
    HttpPost httpPost;
    HttpResponse response;
    ObjectMapper obj;
    Map<String, Object> deserializedREsponse;


    @When("user creates a pet with id, name, status")
    public void user_creates_a_pet_with_id_name_status() throws URISyntaxException, IOException {

        HttpClient httpClient = HttpClientBuilder.create().build(); // opening postman
        //creating a URL
        // https://petstore.swagger.io/v2/pet
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https");
        uri.setHost("petstore.swagger.io");
        uri.setPath("v2/pet");
        //Specify the HTTP Method
        HttpPost httpPost = new HttpPost(uri.build());
        // Add header parameters(content-type, accept)
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Accept", "application/json" );
        //Writing the Body
        HttpEntity httpEntity = new StringEntity(getPetPayload(id, name, status));
        httpPost.setEntity(httpEntity);
        response= httpClient.execute(httpPost); // response


    }

    @Then("the status code is {int}")
    public void the_status_code_is(Integer int1) {

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

    }

    @Then("pet with id, name, status is created")
    public void pet_with_id_name_status_is_created() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        Map<String, Object> deserializedREsponse = obj.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>(){});
        int actualId =(int) deserializedREsponse.get("id");
        String actualname = deserializedREsponse.get("name").toString();
        String actualstatus = deserializedREsponse.get("status").toString();
        Assert.assertEquals(id, actualId);
        Assert.assertEquals(name, actualname);
        Assert.assertEquals(status, actualstatus);



    }
}
