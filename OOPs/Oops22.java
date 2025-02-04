package OOPs;
//22. Write a Java program to create a class called "Customer"
// with attributes for name, email, and purchase history. Implement methods to
// add purchases to the history and calculatetotal expenditure. Create a subclass "LoyalCustomer"
// that adds a discount rate attribute and a method to apply the discount.
import java.util.ArrayList;

 class Customer {
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add a purchase to the history
    public void addPurchase(double amount) {
        if (amount > 0) {
            purchaseHistory.add(amount);
            System.out.println("Purchase added: " + amount);
        } else {
            System.out.println("Invalid purchase amount.");
        }
    }

    // Method to calculate total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    // Method to get customer details
    public String getCustomerDetails() {
        return "Name: " + name + "\nEmail: " + email + "\nTotal Expenditure: " + calculateTotalExpenditure();
    }
}

class LoyalCustomer extends Customer {
    private double discountRate;

    // Constructor
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Method to apply discount
    public double applyDiscount(double amount) {
        double discount = amount * discountRate / 100;
        return amount - discount;
    }

    // Method to add a purchase with discount
    @Override
    public void addPurchase(double amount) {
        double discountedAmount = applyDiscount(amount);
        super.addPurchase(discountedAmount);
        System.out.println("Discount applied: " + (amount - discountedAmount));
    }
}

public class Oops22 {
    public static void main(String[] args) {
        LoyalCustomer loyalCustomer = new LoyalCustomer("Alice", "alice@example.com", 10.0);
        System.out.println(loyalCustomer.getCustomerDetails());

        loyalCustomer.addPurchase(100);
        loyalCustomer.addPurchase(200);

        System.out.println("Final Total Expenditure: " + loyalCustomer.calculateTotalExpenditure());
    }
}
