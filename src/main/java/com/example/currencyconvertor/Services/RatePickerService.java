package com.example.currencyconvertor.Services;

import java.net.*;
import java.io.*;
import org.json.*;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;


public class RatePickerService {
    public static void callinExchangeApi() {
        try {
            URL url = new URL("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            String contentType = con.getHeaderField("Content-Type");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        }catch (Exception e){

        }
        
    }
}
