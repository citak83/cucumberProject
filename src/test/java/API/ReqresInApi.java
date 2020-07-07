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
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

public class ReqresInApi {

    @Test
    public void regresInApiUsersInfo() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();// opened the postman
        URIBuilder uri = new URIBuilder();
        uri.setScheme("https");
        uri.setHost("reqres.in");
        uri.setPath("api/users");
        uri.setCustomQuery("per_page=12");

        HttpGet get = new HttpGet(uri.build()); // set the method
        get.setHeader("Accept", "application/json");// set Header
        HttpResponse response = client.execute(get); // click send button

        ObjectMapper objectMapper=new ObjectMapper();

        Map<String,Object> usersInfo= objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
        });

        System.out.println(usersInfo.get("page"));
        System.out.println(usersInfo.get("per_page"));
        System.out.println(usersInfo.get("total"));
        System.out.println(usersInfo.get("total_pages"));
//      System.out.println(usersInfo.get("data"));// --> I will gey array of Json object

        List<Map<String,Object>> users=( List<Map<String,Object>>)usersInfo.get("data");
        System.out.println(users.size());

        Assert.assertEquals(usersInfo.get("per_page"),users.size()); // verify to per_page users equal 6

        for (int b =0; b<users.size(); b++){
          System.out.println(users.get(b).get("first_name"));
      }
        int sum=0;
        for (Map<String,Object> user :users) {

           sum=sum+(int) user.get("id");


        }
        System.out.println(sum);



    }
}
