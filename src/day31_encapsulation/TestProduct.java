package day31_encapsulation;

public class TestProduct {
    public static void main(String[] args) {

        Product product = new Product("Laptop", "P123", 1200.50);
        System.out.println(product.getProductName());
        System.out.println(product.getProductCode());
        System.out.println(product.getPrice());
    }
}
