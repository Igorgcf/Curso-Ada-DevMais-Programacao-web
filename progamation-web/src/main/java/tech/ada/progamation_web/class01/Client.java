package tech.ada.progamation_web.class01;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Client {

    public void getAddress(){
        get("https://viacep.com.br/ws/01001000/json/");
    }

    public void products(){
        get("https://dummyjson.com/products/1");
    }

    public void get(String endpoint){
        try{
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            Scanner scanner =  new Scanner(url.openStream());
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
