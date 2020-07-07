package API;

import Utils.PayloadUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;

public class POSTRequestIntro extends PayloadUtil {

    @Test
    public void postRequest() throws URISyntaxException, IOException {
        /*
    Steps to execute a API call/ request:
	1. Open/ launch client (open POSTMAN, terminal)
	2. Specify the HTTP method type (GET/POST/PUT/DELETE)
	3. Specify the URL/URI / endpoint(URL==URI)
	4. Add query parameter(if needed)
	5. Add header parameters(content type, accept)
	6. Add body parameter (for post)
	7. Execute(click on send button)
    */

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uriBuilder=new URIBuilder();
        // https://reqres.in/api/users

        //build URL/URI?endPOint
        uriBuilder.setScheme("https");
        uriBuilder.setHost("reqres.in");
        uriBuilder.setPath("api/users");
        // Specify the HTTP method
        HttpPost httpPost=new HttpPost(uriBuilder.build());

        // Add header parameters
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setHeader("Accept","application/json");

        HttpEntity httpEntity=new StringEntity("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        httpPost.setEntity(httpEntity);

        HttpResponse response= client.execute(httpPost);

        Assert.assertEquals(201,response.getStatusLine().getStatusCode());


    }
    @Test
    public void createPet() throws URISyntaxException, IOException {
        HttpClient client=HttpClientBuilder.create().build();
        URIBuilder uriBuilder=new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("petstore.swagger.io");
        uriBuilder.setPath("v2/pet");

        HttpPost post=new HttpPost(uriBuilder.build());

        post.setHeader("Content-Type", "application/json");
        post.setHeader("Accept","application/json");

        HttpEntity httpEntity=new StringEntity(getPetPayload(8978,"Shaylo","do not remove"));

        post.setEntity(httpEntity);
        HttpResponse response=client.execute(post);

        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());


    }

}
