package OOPs;
//28. Write a Java program to create a class called "Reservation"
// with attributes for reservation ID, customer name, and date. Create subclasses
// "ResortReservation" and "RailwayReservation" that add specific attributes like room number
// for hotels and seat number for flights. Implement methods to check reservation status and modify
// reservation details.

import java.util.Date;

class Reservation {
    private String reservationId;
    private String customerName;
    private Date date;

    // Constructor
    public Reservation(String reservationId, String customerName, Date date) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.date = date;
    }

    // Method to get reservation details
    public String getReservationDetails() {
        return "Reservation ID: " + reservationId + "\nCustomer Name: " + customerName + "\nDate: " + date;
    }

    // Method to check reservation status
    public String checkReservationStatus() {
        return "Reservation confirmed for " + customerName + " on " + date;
    }

    // Method to modify reservation details
    public void modifyReservationDetails(String newCustomerName, Date newDate) {
        this.customerName = newCustomerName;
        this.date = newDate;
    }
}

class ResortReservation extends Reservation {
    private int roomNumber;

    // Constructor
    public ResortReservation(String reservationId, String customerName, Date date, int roomNumber) {
        super(reservationId, customerName, date);
        this.roomNumber = roomNumber;
    }

    // Method to get reservation details
    @Override
    public String getReservationDetails() {
        return super.getReservationDetails() + "\nRoom Number: " + roomNumber;
    }

    // Method to modify reservation details
    public void modifyReservationDetails(String newCustomerName, Date newDate, int newRoomNumber) {
        super.modifyReservationDetails(newCustomerName, newDate);
        this.roomNumber = newRoomNumber;
    }
}

class RailwayReservation extends Reservation {
    private String seatNumber;

    // Constructor
    public RailwayReservation(String reservationId, String customerName, Date date, String seatNumber) {
        super(reservationId, customerName, date);
        this.seatNumber = seatNumber;
    }

    // Method to get reservation details
    @Override
    public String getReservationDetails() {
        return super.getReservationDetails() + "\nSeat Number: " + seatNumber;
    }

    // Method to modify reservation details
    public void modifyReservationDetails(String newCustomerName, Date newDate, String newSeatNumber) {
        super.modifyReservationDetails(newCustomerName, newDate);
        this.seatNumber = newSeatNumber;
    }
}

public class Oops28 {
    public static void main(String[] args) {
        Date reservationDate = new Date();
        ResortReservation resortReservation = new ResortReservation("RES123", "Alice", reservationDate, 101);
        System.out.println(resortReservation.getReservationDetails());
        System.out.println(resortReservation.checkReservationStatus());

        resortReservation.modifyReservationDetails("Alice Johnson", new Date(), 102);
        System.out.println("Updated Reservation Details: " + resortReservation.getReservationDetails());

        RailwayReservation railwayReservation = new RailwayReservation("RAIL456", "Bob", reservationDate, "A1");
        System.out.println(railwayReservation.getReservationDetails());
        System.out.println(railwayReservation.checkReservationStatus());

        railwayReservation.modifyReservationDetails("Bob Smith", new Date(), "B2");
        System.out.println("Updated Reservation Details: " + railwayReservation.getReservationDetails());
    }
}