package Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayloadUtil {

    public static String getPetPayload(int id, String name,String status){
        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"" + status + "\"\n" +
                "}";

}

   public static String generateStringFromSource(String path) throws IOException {

       String petPayload=new String(Files.readAllBytes(Paths.get(path)));
       return petPayload;
   }
   public static String getCookieAuthPayload(){
        return "{\n" +
                "    \"username\": \"username\",\n" +
                "    \"password\": \"password\"\n" +
                "}";
   }
   public static String getJiraIssuePayload(){

   }
   public static String get

}