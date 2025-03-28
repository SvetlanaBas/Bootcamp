package day30_constuctors;

public class Flight {
    String flightNumber;
    String destination;
     String departureTime;
    String arrivalTime;
    String departureCity;


    public Flight(String flightNumber, String destination, String departureTime, String arrivalTime, String departureCity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureCity = departureCity;
    }


    public Flight(String flightNumber, String destination, String departureTime, String departureCity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = "8:00 AM";
        this.departureCity = departureCity;
    }


    public Flight(String flightNumber, String destination) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = "6:45 AM";
        this.arrivalTime = "11:50 PM";
        this.departureCity = "Seattle";
    }


    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure City: " + departureCity);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("--------------------------------");
    }


    public void updateDepartureTime(String newTime) {
        this.departureTime = newTime;
        System.out.println("Updated departure time for flight " + flightNumber + ": " + newTime);
    }


    public void updateArrivalTime(String newTime) {
        this.arrivalTime = newTime;
        System.out.println("Updated arrival time for flight " + flightNumber + ": " + newTime);
    }

}
