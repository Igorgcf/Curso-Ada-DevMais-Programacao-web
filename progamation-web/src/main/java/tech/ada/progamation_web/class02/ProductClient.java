package tech.ada.progamation_web.class02;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ProductClient {

    public void findAll() {

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://dummyjson.com/products")).GET().build();

        HttpClient client = HttpClient.newHttpClient();
        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("\n****-----Find All Products from DummyJson:-----****");
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
           // Map responseMap = new ObjectMapper().readValue(response.body(), Map.class) = new HashMap<>();
            System.out.println("Response:" + response);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void findById(){

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://dummyjson.com/products/1")).GET().build();
        HttpClient client = HttpClient.newHttpClient();
        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("\n****-----Product By Id from DummyJson:-----****");
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
            System.out.println("Response:" + response);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void create() throws Exception {

        Product product = new Product("", "Java", "Programação Web", "144.00");

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(product);

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://dummyjson.com/products/add"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody)).build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n****-----Create Product from DummyJson:-----****");
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
            System.out.println("Response:" + response);

    }

    public void update() throws Exception {

        Product product = new Product("2", "Data", "SQL", "77.77");

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(product);

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://dummyjson.com/products/1"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(jsonBody)).build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("\n****-----Update Product from DummyJson:-----****");
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
            System.out.println("Response:" + response);
    }

    public void delete() throws Exception{

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://dummyjson.com/products/1"))
                .DELETE().build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("\n****-----Delete Product from DummyJson:-----****");
        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
        System.out.println("Response:" + response);

    }
}
