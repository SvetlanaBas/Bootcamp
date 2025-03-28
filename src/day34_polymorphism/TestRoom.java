package day34_polymorphism;

public class TestRoom {
    public static void main(String[] args) {
        StandardRoom standard = new StandardRoom(451, 65, true);
        SuiteRoom suite = new SuiteRoom(1845, 117, false);

        standard.displayStandardRoom();
        System.out.println("Calculate Standard Room Price = " + standard.calculatePrice());
        System.out.println("Calculate Standard Room Price in days = " + standard.calculatePrice(7));
        System.out.println("Calculate Standard Room Price in days with discount = " + standard.calculatePrice(5, 15));
        System.out.println("------------");

        suite.displaySuiteRoom();
        System.out.println("Calculate Suite room Price = " + suite.calculatePrice());
        System.out.println("Calculate Suite room Price in days with discount = " + suite.calculatePrice(12, 25));
        System.out.println("Calculate Suite room Price in days = " + suite.calculatePrice(9));
    }
}
