package OOPs;
//19. Write a Java program to create a class with methods
// to search for flights and hotels, and to book and cancel reservations.

import java.util.ArrayList;
import java.util.HashMap;

public class Oops19 {
    private HashMap<String, String> flights;
    private HashMap<String, String> hotels;
    private ArrayList<String> bookedFlights;
    private ArrayList<String> bookedHotels;

    // Constructor
    public Oops19() {
        flights = new HashMap<>();
        hotels = new HashMap<>();
        bookedFlights = new ArrayList<>();
        bookedHotels = new ArrayList<>();
    }

    // Method to add a flight
    public void addFlight(String flightNumber, String details) {
        flights.put(flightNumber, details);
    }

    // Method to add a hotel
    public void addHotel(String hotelName, String details) {
        hotels.put(hotelName, details);
    }

    // Method to search for flights
    public String searchFlight(String flightNumber) {
        return flights.getOrDefault(flightNumber, "Flight not found");
    }

    public String searchHotel(String hotelName) {
        return hotels.getOrDefault(hotelName, "Hotel not found");
    }

    // Method to book a flight
    public void bookFlight(String flightNumber) {
        if (flights.containsKey(flightNumber)) {
            bookedFlights.add(flightNumber);
            System.out.println("Flight " + flightNumber + " booked successfully.");
        } else {
            System.out.println("Flight not found.");
        }
    }

    // Method to book a hotel
    public void bookHotel(String hotelName) {
        if (hotels.containsKey(hotelName)) {
            bookedHotels.add(hotelName);
            System.out.println("Hotel " + hotelName + " booked successfully.");
        } else {
            System.out.println("Hotel not found.");
        }
    }

    // Method to cancel a flight reservation
    public void cancelFlight(String flightNumber) {
        if (bookedFlights.remove(flightNumber)) {
            System.out.println("Flight " + flightNumber + " reservation cancelled.");
        } else {
            System.out.println("Flight reservation not found.");
        }
    }

    // Method to cancel a hotel reservation
    public void cancelHotel(String hotelName) {
        if (bookedHotels.remove(hotelName)) {
            System.out.println("Hotel " + hotelName + " reservation cancelled.");
        } else {
            System.out.println("Hotel reservation not found.");
        }
    }

    public static void main(String[] args) {
        // Example usage
       Oops19 travelService = new Oops19();
        travelService.addFlight("AI101", "Air India, Delhi to Mumbai");
        travelService.addHotel("Taj Hotel", "5-star hotel in Mumbai");

        System.out.println(travelService.searchFlight("AI101"));
        System.out.println(travelService.searchHotel("Taj Hotel"));

        travelService.bookFlight("AI101");
        travelService.bookHotel("Taj Hotel");

        travelService.cancelFlight("AI101");
        travelService.cancelHotel("Taj Hotel");
    }
}
