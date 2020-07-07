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
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CatFacts {

    @Test
    public void catFacts() throws URISyntaxException, IOException {
        HttpClient client = HttpClientBuilder.create().build();// opened the postman
        //http://cat-fact.herokuapp.com/facts --> set the url

        URIBuilder uri = new URIBuilder();
        uri.setScheme("http");
        uri.setHost("cat-fact.herokuapp.com");
        uri.setPath("facts");

        HttpGet get = new HttpGet(uri.build()); // set the method
        get.setHeader("Accept", "application/json");// set Header
        HttpResponse response = client.execute(get); // click send button
        //Deserialization
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, List> parsedResponse =objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String,List>>() {
        });
        parsedResponse.get("all");
        System.out.print(parsedResponse.get("all").size());

        // We want to get number of the JSON objects
    }
    @Test
    public void countNonCatFacts() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();// opened the postman
        //http://cat-fact.herokuapp.com/facts --> set the url

        URIBuilder uri = new URIBuilder();
        uri.setScheme("http");
        uri.setHost("cat-fact.herokuapp.com");
        uri.setPath("facts");

        HttpGet get = new HttpGet(uri.build()); // set the method
        get.setHeader("Accept", "application/json");// set Header
        HttpResponse response = client.execute(get); // click send button
        //Deserialization
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, List<Map<String, Object>>> parsedResponse =objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, List<Map<String, Object>>>>() {
                });
 //       System.out.println(parsedResponse.get("all").get(0).get("text"));

        List<Map<String,Object>> mapList= parsedResponse.get("all"); // return List

        for (Map<String,Object> map : mapList) {
            System.out.println(map.get("text"));
            // When we want to get first and last name
            Map<String,Object> userInfo=(Map<String,Object>)map.get("user");
            Map<String, String> firstLastName=(Map<String, String> )userInfo.get("name");

            System.out.println(firstLastName.get("first"));
            System.out.println(firstLastName.get("last"));



        }

        }
}

