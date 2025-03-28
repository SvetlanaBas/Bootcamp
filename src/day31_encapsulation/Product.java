package day31_encapsulation;

public class Product {

        private String productName;
        private String productCode;
        private double price;

        public Product(String productName, String productCode, double price) {
            this.productName = productName;
            this.productCode = productCode;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("productName = " + productName);
            System.out.println("productCode = " + productCode);
            System.out.println("price = " + price);
        }

        public String getProductName() {
            return productName;
        }

        public String getProductCode() {
            return productCode;
        }

        public double getPrice() {
            return price;
        }
    }

