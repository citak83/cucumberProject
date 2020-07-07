package API;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
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

public class ItunesSearch {
    int limitValue=100;
    @Test
    public void singerSearch() throws URISyntaxException, IOException {


        HttpClient client = HttpClientBuilder.create().build();// opened the postman
        URIBuilder uri = new URIBuilder();

        uri.setScheme("https");
        uri.setHost("itunes.apple.com");
        uri.setPath("search");
        uri.setCustomQuery("term=Imagine Dragons&limit=`"+limitValue);

        HttpGet get = new HttpGet(uri.build()); // set the method
        get.setHeader("Accept", "application/json");// set Header
        HttpResponse response = client.execute(get); // click send button

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, Object> mapper = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });
        List<Map<String,Object>> data=(List<Map<String, Object>>) mapper.get("results");

        for (Map<String ,Object> n: data){
            System.out.println(n.get("artistName"));
            String temp="" +n.get("artistName");
            Assert.assertTrue(temp.contains("Imagine Dragons"));
        }
        Assert.assertEquals(limitValue,data.size());
        Assert.assertEquals(limitValue, mapper.get("resultCount"));
    }
}