package API;

import API.pojo.PetPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.net.URISyntaxException;
import java.sql.SQLOutput;

public class PetRequest {

    @Test
    public void getPet() throws URISyntaxException, IOException {

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        // https://petstore.swagger.io/v2/pet
        uri.setScheme("https");
        uri.setHost("petstore.swagger.io");
        uri.setPath("v2/pet/12");

        HttpGet httpGet = new HttpGet(uri.build()); // set the method
        httpGet.setHeader("Accept","application/json");

        HttpResponse response = client.execute(httpGet); // click send button

        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());

        ObjectMapper objectMapper=new ObjectMapper(); //

        PetPojo deserializedObject= objectMapper.readValue(response.getEntity().getContent(),
                PetPojo.class);

        System.out.println(deserializedObject.getId());
        System.out.println(deserializedObject.getName());

    }
}
