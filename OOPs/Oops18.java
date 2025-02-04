package OOPs;
//. Write a Java program to create a class called "Restaurant" with attributes for menu
// items, prices,and ratings, and methods to add and remove items, and to calculate average rating.
import java.util.ArrayList;
import java.util.HashMap;

public class Oops18 {
    private HashMap<String, Double> menuItems;
    private ArrayList<Double> ratings;

    // Constructor
    public Oops18() {
        menuItems = new HashMap<>();
        ratings = new ArrayList<>();
    }

    // Method to add a menu item
    public void addMenuItem(String item, double price) {
        menuItems.put(item, price);
    }

    // Method to remove a menu item
    public void removeMenuItem(String item) {
        menuItems.remove(item);
    }

    // Method to add a rating
    public void addRating(double rating) {
        ratings.add(rating);
    }

    // Method to calculate average rating
    public double calculateAverageRating() {
        double sum = 0;
        for (double rating : ratings) {
            sum += rating;
        }
        return ratings.size() > 0 ? sum / ratings.size() : 0;
    }

    // Method to get menu items
    public HashMap<String, Double> getMenuItems() {
        return menuItems;
    }

    public static void main(String[] args) {
        // Example usage
        Oops18 restaurant = new Oops18();
        restaurant.addMenuItem("Pasta", 12.99);
        restaurant.addMenuItem("Pizza", 9.99);
        restaurant.addRating(4.5);
        restaurant.addRating(4.0);
        restaurant.addRating(5.0);

        System.out.println("Menu Items: " + restaurant.getMenuItems());
        System.out.println("Average Rating: " + restaurant.calculateAverageRating());

        restaurant.removeMenuItem("Pizza");
        System.out.println("Menu Items after removal: " + restaurant.getMenuItems());
    }
}