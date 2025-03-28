package day30_constuctors;

public class TestFlight {
    public static void main(String[] args) {
        Flight flight1 = new Flight("AA123", "New York", "10:00 AM", "2:00 PM", "Los Angeles");
        flight1.displayInfo();
        flight1.updateDepartureTime("11:00 AM");
        flight1.updateArrivalTime("3:00 PM");


        Flight flight2 = new Flight("BA456", "London", "8:00 AM", "Paris");
        flight2.displayInfo();
        flight2.updateDepartureTime("9:00 AM");


        Flight flight3 = new Flight("DL789", "Tokyo");
        flight3.displayInfo();
        flight3.updateArrivalTime("6:00 PM");
    }
}
