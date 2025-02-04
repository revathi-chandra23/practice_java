package OOPs;
//. Write a Java program to create a class called "Pet" with attributes
// for name, species, and age. Create subclasses "Dog" and "Bird" that add specific
// attributes like favorite toy for dogs and wing span for birds. Implement methods to
// display pet details and calculate the pet's age in human years

class Pet {
    private String name;
    private String species;
    private int age;

    // Constructor
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Method to display pet details
    public void displayPetDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    // Method to calculate pet's age in human years
    public int calculateHumanYears() {
        return age; // Default implementation, can be overridden by subclasses
    }
}

class Dogs extends Pet {
    private String favoriteToy;

    // Constructor
    public Dogs(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    // Method to display pet details
    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }

    // Method to calculate dog's age in human years
    @Override
    public int calculateHumanYears() {
        return getAge() * 7; // Assuming 1 dog year = 7 human years
    }

    // Method to get the age of the dog
    private int getAge() {
        return super.calculateHumanYears();
    }
}

class Bird extends Pet {
    private double wingSpan; // Wing span in inches

    // Constructor
    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    // Method to display pet details
    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Wing Span: " + wingSpan + " inches");
    }

    // Method to calculate bird's age in human years
    @Override
    public int calculateHumanYears() {
        return getAge() * 5; // Assuming 1 bird year = 5 human years
    }

    // Method to get the age of the bird
    private int getAge() {
        return super.calculateHumanYears();
    }
}

public class Oops29{
    public static void main(String[] args) {
        // Example usage
        Dogs dog = new Dogs("Buddy", 3, "Ball");
        dog.displayPetDetails();
        System.out.println("Age in Human Years: " + dog.calculateHumanYears());

        Bird bird = new Bird("Tweety", 2, 12.5);
        bird.displayPetDetails();
        System.out.println("Age in Human Years: " + bird.calculateHumanYears());
    }
}