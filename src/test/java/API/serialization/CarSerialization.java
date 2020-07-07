package API.serialization;

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

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


public class CarSerialization {

    @Test
    public void getCarInfo() throws IOException {

        Car car=new Car("Audi","black",2015);
        car.setPrice(34000);
        car.setCondition("new");

        ObjectMapper objectMapper=new ObjectMapper();

        objectMapper.writeValue(new File("target/car.json"), car);

    }
    @Test
    public void createPet() throws URISyntaxException, IOException {
        HttpClient client= HttpClientBuilder.create().build();
        URIBuilder uriBuilder=new URIBuilder();
        uriBuilder.setScheme("https").setHost("petstore.swagger.io").setPath("v2/pet");
        HttpPost post=new HttpPost(uriBuilder.build());

        post.setHeader("Content-Type","application/json");
        post.setHeader("Accept","application/json");

        String petPayload= PayloadUtil.generateStringFromSource("target/pet.json");

        HttpEntity entity=new StringEntity(petPayload);

        post.setEntity(entity);

        HttpResponse response=client.execute(post);

        Assert.assertEquals(HttpStatus.SC_OK,response.getStatusLine().getStatusCode());

    }
}
