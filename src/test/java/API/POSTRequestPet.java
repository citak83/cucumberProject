package API;

import Utils.PayloadUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.bs.A;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Map;

public class POSTRequestPet extends PayloadUtil {

    /*
    1.Create a pet
    2. verify new pet's id , name,status
     */
    @Test
    public void getPetInfo() throws URISyntaxException, IOException {

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        // https://petstore.swagger.io/v2/pet
        uri.setScheme("https");
        uri.setHost("petstore.swagger.io");
        uri.setPath("v2/pet");

        HttpPost httpPost = new HttpPost(uri.build()); // set the method

        httpPost.setHeader("Content-Type", "application/json");// set Header
        httpPost.setHeader("Accept","application/json");

        int id= 1956;
        String name="hatiko";
        String status="waiting";

        HttpEntity entity=new StringEntity(getPetPayload(id,name,status));
        httpPost.setEntity(entity);

        HttpResponse response = client.execute(httpPost); // click send button

        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());

        ObjectMapper objectMapper=new ObjectMapper();

        Map<String,Object> parsedResponse=objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
        });

        int actualID=(int)parsedResponse.get("id");
        String actualName=parsedResponse.get("name").toString();
        String actualStatus=parsedResponse.get("status").toString();

        Assert.assertEquals(id,actualID);
        Assert.assertEquals(name,actualName);
        Assert.assertEquals(status,actualStatus);

        // Execute GET request and do verification

        uri.setPath("v2/pet/" + id);
        HttpGet get=new HttpGet(uri.build());
        get.setHeader("Accept", "application/json");
        System.out.println("Started executing GET request");
        response=client.execute(get);
        System.out.println("Finished executing GET request");

        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());
        Assert.assertEquals("application/json", response.getEntity().getContentType().getValue());
        System.out.println("Deserializing response");
        parsedResponse=objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
        });

        Assert.assertEquals(id,parsedResponse.get("id"));
        Assert.assertEquals(name,parsedResponse.get("name"));
        Assert.assertEquals(status,parsedResponse.get("status"));



    }

}
