package API;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class DeserializationIntro {

    @Test
    public void deserialization() throws URISyntaxException, IOException {

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uriBuilder=new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("petstore.swagger.io");
        uriBuilder.setPath("v2/pet/1");

        HttpGet httpGet=new HttpGet(uriBuilder.build());
        httpGet.setHeader("Accept","application/json");

        HttpResponse response=client.execute(httpGet);

        if(response.getStatusLine().getStatusCode() !=200) {
            Assert.fail();
        }
            ObjectMapper objectMapper=new ObjectMapper();
            Map<String,Object> deserilizedResponse= objectMapper.readValue(response.getEntity().getContent(),
                    new TypeReference<Map<String,Object>>(){});

            System.out.println("The id from response body is: "+deserilizedResponse.get("id"));
            System.out.println("The name from response body is: "+deserilizedResponse.get("name"));

            Map<String,Object> category=(Map<String,Object>)deserilizedResponse.get("category");
            System.out.println("category name is: "+category.get("name"));

        }
        @Test
    public void apiUsers() throws URISyntaxException, IOException {
            HttpClient client= HttpClientBuilder.create().build();
            URIBuilder uriBuilder=new URIBuilder();
            uriBuilder.setScheme("https");
            uriBuilder.setHost("reqres.in");
            uriBuilder.setPath("api/users/2");

            HttpGet httpGet=new HttpGet(uriBuilder.build());
            httpGet.setHeader("Accept","application/json");

            HttpResponse response=client.execute(httpGet);

           Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());

            ObjectMapper objectMapper=new ObjectMapper();
            Map<String,Object> deserilizedResponse= objectMapper.readValue(response.getEntity().getContent(),
                    new TypeReference<Map<String,Object>>(){
            });

            Map<String,String> ad=(Map<String,String>)deserilizedResponse.get("ad");
            System.out.println("ad company is: "+ad.get("company"));
        }



}


