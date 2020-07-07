package API;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class ApiMapCharacters {

    @Test
    public void getAllHouses() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();// opened the postman
        URIBuilder uri = new URIBuilder();

        // https://api.got.show/api/map/characters
        uri.setScheme("https");
        uri.setHost("api.got.show");
        uri.setPath("api/map/characters");

        HttpGet get = new HttpGet(uri.build()); // set the method
        get.setHeader("Accept", "application/json");// set Header
        HttpResponse response = client.execute(get); // click send button

        ObjectMapper objectMapper=new ObjectMapper();

        Map<String, Object> parsedResponse=objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
        });

       List<Map<String, Object>> dataValues= (List<Map<String, Object>>)parsedResponse.get("data");
       Map<String, Object> firstHouse=dataValues.get(0);

        System.out.println(firstHouse.get("house"));

 //       for (int b =0; b<dataValues.size(); b++){
 //           System.out.println(dataValues.get(b).get("house"));
 //       }
        for (Map<String ,Object> data : dataValues){
            System.out.println(data.get("house"));
        }
    }
}
