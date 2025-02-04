package OOPs;
//24. Write a Java program to create a class called "ElectronicsProduct"
// with attributes for product ID, name, and price. Implement methods to apply a
// discount and calculate the final price. Create a subclass " WashingMachine" that adds
// a warranty period attribute and a method to extend the warranty.
class ElectronicsProduct {
    private String productId;
    private String name;
    private double price;

    // Constructor
    public ElectronicsProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Method to apply a discount
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            price -= price * discountPercentage / 100;
            System.out.println("Discount applied: " + discountPercentage + "%");
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Method to calculate the final price
    public double calculateFinalPrice() {
        return price;
    }

    // Method to get product details
    public String getProductDetails() {
        return "Product ID: " + productId + "\nName: " + name + "\nPrice: " + price;
    }
}

class WashingMachine extends ElectronicsProduct {
    private int warrantyPeriod; // Warranty period in months

    // Constructor
    public WashingMachine(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    // Method to extend the warranty
    public void extendWarranty(int additionalMonths) {
        if (additionalMonths > 0) {
            warrantyPeriod += additionalMonths;
            System.out.println("Warranty extended by: " + additionalMonths + " months");
        } else {
            System.out.println("Invalid warranty extension period.");
        }
    }

    // Method to get product details
    @Override
    public String getProductDetails() {
        return super.getProductDetails() + "\nWarranty Period: " + warrantyPeriod + " months";
    }
}


public class Oops24 {
    public static void main(String[] args) {
        // Example usage
        WashingMachine washingMachine = new WashingMachine("WM123", "SuperWash 3000", 500.0, 24);
        System.out.println(washingMachine.getProductDetails());

        washingMachine.applyDiscount(10);
        System.out.println("Final Price: " + washingMachine.calculateFinalPrice());

        washingMachine.extendWarranty(12);
        System.out.println("Updated Product Details: " + washingMachine.getProductDetails());
    }
}
