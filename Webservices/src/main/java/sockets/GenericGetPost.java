package sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Matthias.Flueckiger
 */
public class GenericGetPost {
    public void sendGet(String httpUrl){
        try {
            //Create URL object
            URL url = new URL(httpUrl);
            //Open a connection. NOTE: Doesn't establish the connection yet
            HttpURLConnection conHttp = (HttpURLConnection) url.openConnection();
            //Now its open, so we can add request method, headers etc.
            conHttp.setRequestProperty("User-Agent", "Mozilla/5.0");
            conHttp.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            //Set request method
            conHttp.setRequestMethod("GET");
            String urlGetParameters = ""; // Get-Parameters

            int responseCode = conHttp.getResponseCode();
            System.out.println("Sending GET request to URL: " + httpUrl);
            System.out.println("Get parameters: " + urlGetParameters);
            System.out.println("Response Code: " + responseCode);
            //Make the actual request
            BufferedReader in = new BufferedReader(new InputStreamReader(conHttp.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            String responseString = response.toString();
            in.close();

            String[] arrOfString = responseString.split(",");
            for (String a : arrOfString) {
                System.out.println(a);
            }
        } catch (IOException e) {
            System.out.println("could not connect to url");
        }
    }

    public void sendPost(String httpUrl, String urlPostParameters){
        try {
            //Create URL object
            URL url = new URL(httpUrl);
            //Open a connection. NOTE: Doesn't establish the connection yet
            HttpURLConnection conHttp = (HttpURLConnection) url.openConnection();
            //Now its open, so we can add request method, headers etc.
            conHttp.setRequestProperty("User-Agent", "Mozilla/5.0");
            conHttp.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            //Set request method
            conHttp.setRequestMethod("POST");
            conHttp.setDoOutput(true);

            DataOutputStream wr = new DataOutputStream(conHttp.getOutputStream());
            wr.writeBytes(urlPostParameters);
            wr.flush();
            wr.close();

            int responseCode = conHttp.getResponseCode();
            System.out.println("Sending POST request to URL: " + httpUrl);
            System.out.println("Post parameters: " + urlPostParameters);
            System.out.println("Response Code: " + responseCode);
            //Make the actual request
            BufferedReader in = new BufferedReader(new InputStreamReader(conHttp.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            String responseString = response.toString();
            in.close();

            String[] arrOfString = responseString.split(",");
            for (String a : arrOfString) {
                System.out.println(a);
            }
        } catch(IOException e){
            System.out.println("could not connect to url");
        }
    }


    public static void main(String[] args) {
        GenericGetPost myIp = new GenericGetPost();
        GenericGetPost hftmLamp = new GenericGetPost();
        GenericGetPost weather = new GenericGetPost();

        System.out.println("-------------------- My Ip --------------------");
        myIp.sendGet("http://ip-api.com/json");
        System.out.println("-----------------------------------------------\n");

        System.out.println("------------------- weather -------------------");
        weather.sendGet("http://api.openweathermap.org/data/2.5/weather?q=Bern&appid=b635ecb76f1ecaad90b1847c38a535e4");
        System.out.println("-----------------------------------------------\n");

        System.out.println("------------------ HFTM lamp ------------------");
        hftmLamp.sendGet("http://10.100.129.193/api/v1/device");
        hftmLamp.sendPost("http://10.100.129.193/api/v1/device/6001942C43B6","action=toggle");
        System.out.println("-----------------------------------------------\n");

    }
}
