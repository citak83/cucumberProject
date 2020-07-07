package API;

import API.pojo.BreakingBad2Pojo;
import com.fasterxml.jackson.databind.DeserializationFeature;
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

public class BreakingBadApi2 {

    @Test
    public void getNameOfCharacter() throws URISyntaxException, IOException {


        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        //https://breakingbadapi.com/api/characters
        uri.setScheme("https");
        uri.setHost("breakingbadapi.com");
        uri.setPath("api/characters/12");
        HttpGet get = new HttpGet(uri.build());
        get.setHeader("Accept", "application/json");

        HttpResponse response = client.execute(get);
        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

//        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES,true);
//        List<BreakinBadCharPojo> breakingBadCharPojosPojo=objectMapper.readValue(response.getEntity().getContent(),
//                new TypeReference<List<BreakinBadCharPojo>>() {});

        List<BreakingBad2Pojo> breakingBadCharPojoList = objectMapper.readValue(response.getEntity().getContent(),
                objectMapper.getTypeFactory().constructCollectionType(List.class, BreakingBad2Pojo.class));

        System.out.println("Name of the character " + breakingBadCharPojoList.get(0).getName() + " is "
                + breakingBadCharPojoList.get(0).getStatus()
                + " portrayed " + breakingBadCharPojoList.get(0).getPortrayed()
                + " , in " + breakingBadCharPojoList.get(0).getCategory());

        System.out.println(String.format("%s is %s portrayed %s, in %s", breakingBadCharPojoList.get(0).getName(),
                breakingBadCharPojoList.get(0).getStatus(),
                breakingBadCharPojoList.get(0).getPortrayed(),
                breakingBadCharPojoList.get(0).getCategory()));

    }
}