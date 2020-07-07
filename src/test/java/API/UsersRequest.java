package API;

import API.pojo.PetPojo;
import API.pojo.UsersPojo;
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

public class UsersRequest {

    @Test
    public void getUser() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("reqres.in");
        uriBuilder.setPath("api/users/7");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        //   httpGet.setHeader("Accept", "application/json");
        HttpResponse response = client.execute(httpGet);
        ObjectMapper objectMapper =new ObjectMapper();
        UsersPojo desirial = objectMapper.readValue(response.getEntity().getContent(),
                UsersPojo.class);

        System.out.println(desirial.getData().getFirst_name());
        System.out.println(desirial.getData().getLast_name());
    }


    }

