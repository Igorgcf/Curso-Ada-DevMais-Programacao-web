package tech.ada.progamation_web.class02;

public class Main {

    public static void main(String[] args) throws Exception {

        ProductClient productClient = new ProductClient();

        productClient.findAll();
        productClient.findById();
        productClient.create();
        productClient.update();
        productClient.delete();
    }
}
