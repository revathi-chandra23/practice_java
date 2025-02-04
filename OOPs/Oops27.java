package OOPs;
//27. Write a Java program to create a class called "CustomerOrder"
// with attributes for order ID, customer, and order date. Create a subclass
// "OnlineOrder" that adds attributes for delivery address and tracking number.
// Implement methods to calculate delivery time based on the address and update the tracking status.


import java.util.Date;

class CustomerOrder {
    private String orderId;
    private String customer;
    private Date orderDate;

    // Constructor
    public CustomerOrder(String orderId, String customer, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    // Method to get order details
    public String getOrderDetails() {
        return "Order ID: " + orderId + "\nCustomer: " + customer + "\nOrder Date: " + orderDate;
    }
}

class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    private String trackingStatus;

    // Constructor
    public OnlineOrder(String orderId, String customer, Date orderDate, String deliveryAddress, String trackingNumber) {
        super(orderId, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Order placed";
    }

    // Method to calculate delivery time based on the address
    public int calculateDeliveryTime() {
        // For simplicity, let's assume delivery time is based on the length of the address string
        return deliveryAddress.length() % 10 + 1; // Delivery time in days
    }

    // Method to update the tracking status
    public void updateTrackingStatus(String status) {
        this.trackingStatus = status;
    }

    // Method to get order details
    @Override
    public String getOrderDetails() {
        return super.getOrderDetails() + "\nDelivery Address: " + deliveryAddress + "\nTracking Number: " + trackingNumber + "\nTracking Status: " + trackingStatus;
    }
}

public class Oops27 {
    public static void main(String[] args) {
        // Example usage
        Date orderDate = new Date();
        OnlineOrder onlineOrder = new OnlineOrder("ORD123", "John Doe", orderDate, "123 Main St, Springfield", "TRACK123");
        System.out.println(onlineOrder.getOrderDetails());

        int deliveryTime = onlineOrder.calculateDeliveryTime();
        System.out.println("Estimated Delivery Time: " + deliveryTime + " days");

        onlineOrder.updateTrackingStatus("Shipped");
        System.out.println("Updated Order Details: " + onlineOrder.getOrderDetails());
    }
}
