package tech.ada.progamation_web.class01;

public class Main {

    public static void main(String[] args) {


        Client client = new Client();

        System.out.println("Address via CEP:");
        client.getAddress();

        System.out.println("Product By Id from DummyJson:");
        client.products();
    }
}
