package API;

import API.pojo.BreakingBadPojo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakingBadApi {

    private static final String ALIVE = "alive";
    private static final String DECEASED = "deceased";
    private static final String PRESUMED_DEAD = "presumed dead";


    @Test
    public void getCharacters() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();

        //  https://breakingbadapi.com/api/characters
        uri.setScheme("https");
        uri.setHost("breakingbadapi.com");
        uri.setPath("api/characters");


        HttpGet get = new HttpGet(uri.build());
        get.setHeader("Accept", "application/json");

        HttpResponse response = client.execute(get);

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        List<BreakingBadPojo> breakingBadPojos = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<List<BreakingBadPojo>>() {
                });

        System.out.println(breakingBadPojos.get(0).getName());

        Map<String, List<String>> characterByCategory = new HashMap<>();
        List<String> alive = new ArrayList<>();
        List<String> deceased = new ArrayList<>();
        List<String> presumedDead = new ArrayList<>();

        for (int i = 0; i < breakingBadPojos.size(); i++) {
            if (breakingBadPojos.get(i).getStatus().equalsIgnoreCase(ALIVE)) {
                alive.add(breakingBadPojos.get(i).getName());
            }else if (breakingBadPojos.get(i).getStatus().equalsIgnoreCase(DECEASED)){
                deceased.add(breakingBadPojos.get(i).getName());
            } else if (breakingBadPojos.get(i).getStatus().equalsIgnoreCase(PRESUMED_DEAD)){
                presumedDead.add(breakingBadPojos.get(i).getName());
            }else{
                System.out.println("Unknown status: "+breakingBadPojos.get(i).getStatus());
            }

        }
        characterByCategory.put(ALIVE, alive);
        characterByCategory.put(DECEASED, deceased);
        characterByCategory.put(PRESUMED_DEAD,presumedDead);


        System.out.println("List of alive characters: "+characterByCategory.get(ALIVE));
        System.out.println("List of deceased characters: "+characterByCategory.get(DECEASED));
        System.out.println("List of presumed dead characters: "+characterByCategory.get(PRESUMED_DEAD));
        }


    }

