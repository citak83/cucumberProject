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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Planets {

    @Test
    public void getPlanetsInfo() throws URISyntaxException, IOException {

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uriBuilder= new URIBuilder();
        // https://swapi.dev/api/planets
        uriBuilder.setScheme("https");
        uriBuilder.setHost("swapi.dev");
        uriBuilder.setPath("api/planets");

        HttpGet get= new HttpGet(uriBuilder.build());
        get.setHeader("Accept","application/json");
        get.setHeader("Content-Type", "application/json");

        HttpResponse response=client.execute(get);
        ObjectMapper objectMapper=new ObjectMapper();

        Map<String ,Object> parsedResponse=objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
        });

        List<Map<String ,Object>> results=(List<Map<String ,Object>> ) parsedResponse.get("results");

        Map<String ,String> planestpopulationMap=new HashMap<>();

        for (int i=0; i<results.size(); i++) {
            String planet = results.get(i).get("name").toString();
            String population = results.get(i).get("population").toString();

            planestpopulationMap.put(planet, population);
        }
        System.out.println(planestpopulationMap);
    }
}
