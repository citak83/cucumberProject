package API.jira.api;

import API.pojo.JiraCookiePojo;
import Utils.PayloadUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
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

public class CookieAuth extends PayloadUtil {

    @Test
    public void getCookie() throws URISyntaxException, IOException {

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uriBuilder=new URIBuilder();

        // http://localhost:8080/rest/auth/1/session
        uriBuilder.setScheme("http");
        uriBuilder.setHost("localhost");
        uriBuilder.setPort(8080);
        uriBuilder.setPath("rest/auth/1/session");

        HttpPost post=new HttpPost(uriBuilder.build());

        post.setHeader("Content-Type", "application/json");
        post.setHeader("Accept","application/json");

        HttpEntity entity=new StringEntity(getCookieAuthPayload());
        post.setEntity(entity);

        HttpResponse response= client.execute(post);
        ObjectMapper objectMapper=new ObjectMapper();

        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());

        JiraCookiePojo jiraCookiePojo= objectMapper.readValue(response.getEntity().getContent(),
                JiraCookiePojo.class);

        System.out.println(jiraCookiePojo.getSession().get("name"));
        System.out.println(jiraCookiePojo.getSession().get("value"));

    }
    @Test
    public void createIssue() throws URISyntaxException, IOException {

        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uriBuilder=new URIBuilder();

        // http://localhost:8080/rest/auth/1/session
        uriBuilder.setScheme("http");
        uriBuilder.setHost("localhost");
        uriBuilder.setPort(8080);
        uriBuilder.setPath("rest/api/2/issue");

        HttpPost post=new HttpPost(uriBuilder.build());

        post.setHeader("Content-Type", "application/json");
        post.setHeader("Accept","application/json");


        HttpEntity entity=new StringEntity(getJiraIssuePayload());
        post.setEntity(entity);

        HttpResponse response= client.execute(post);
        ObjectMapper objectMapper=new ObjectMapper();


    }
}
