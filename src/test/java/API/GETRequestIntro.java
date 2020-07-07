package API;

import io.cucumber.java.bs.A;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class GETRequestIntro {

    @Test
    public void getRequest() throws URISyntaxException, IOException {
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
    // Open a client
    HttpClient client= HttpClientBuilder.create().build();

    // Specify the URL/URI / endpoint
    // https://petstore.swagger.io/v2/pet/{petId}
    URIBuilder uri=new URIBuilder();
    uri.setScheme("https");
    uri.setHost("petstore.swagger.io");
    uri.setPath("v2/pet/6547");

    // Specify the HTTP method type (GET/POST/PUT/DELETE)
    HttpGet get=new HttpGet(uri.build());
    // Add header parameters
    get.setHeader("Accept","application/json");
    // Execute
    HttpResponse response= client.execute(get);

        Assert.assertEquals(200,response.getStatusLine().getStatusCode());
        System.out.println("Status code for GET request is: "+response.getStatusLine().getStatusCode());

        Assert.assertEquals("application/json",response.getEntity().getContentType().getValue());
    }
    @Test
    public void getRequest2() throws URISyntaxException, IOException {

        // execute a get request to:
        // https://petstore.swagger.io/v2/pet/findByStatus?status=sold

        HttpClient client=HttpClientBuilder.create().build();
        URIBuilder uri=new URIBuilder();
        uri.setScheme("https");
        uri.setHost("petstore.swagger.io");
        uri.setPath("v2/pet/findByStatus");
        uri.setCustomQuery("status=sold");

        HttpGet get=new HttpGet(uri.build());
        get.setHeader("Accept","application/json");

        HttpResponse response=client.execute(get);

        Assert.assertEquals(200, response.getStatusLine().getStatusCode());
        Assert.assertEquals("aaplication/json",response.getEntity().getContentType().getValue());
        System.out.println(response.getStatusLine().getStatusCode());
    }
}
