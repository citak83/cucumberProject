package API.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class SerializationIntro {

    @Test
    public void serialize() throws IOException {
         Pet pet=new Pet("Hatiko","waiting",3);
         pet.setId(1);
         pet.setPhotoUrl("https://s3.petpics.amazon.com");

        ObjectMapper objectMapper=new ObjectMapper();

        objectMapper.writeValue(new File("target/pet.json"), pet);

    }
}
