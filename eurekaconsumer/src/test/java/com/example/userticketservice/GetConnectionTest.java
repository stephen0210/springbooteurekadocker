package com.example.userticketservice;

import org.junit.jupiter.api.Test;

import java.net.HttpURLConnection;
import java.net.URL;

public class GetConnectionTest {

    @Test
    public void testConnection(){
        try {
            URL obj = new URL("http://eurekaclient:8080/greet/stephenFernandes");
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            System.out.println("GET Response Code :: " + responseCode);
        } catch ( Throwable t){
            t.printStackTrace();
        }
    }
}
