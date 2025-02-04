package OOPs;
class Building {
    private String address;
    private int numberOfFloors;
    private double totalArea;

    // Constructor
    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    // Method to get building details
    public String getBuildingDetails() {
        return "Address: " + address + "\nNumber of Floors: " + numberOfFloors + "\nTotal Area: " + totalArea + " sq ft";
    }
}

class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment;

    // Constructor
    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    // Method to get building details
    @Override
    public String getBuildingDetails() {
        return super.getBuildingDetails() + "\nNumber of Apartments: " + numberOfApartments + "\nRent per Apartment: " + rentPerApartment;
    }
}

class CommercialBuilding extends Building {
    private double officeSpace; // Office space in square feet
    private double rentPerSquareFoot;

    // Constructor
    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace, double rentPerSquareFoot) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareFoot = rentPerSquareFoot;
    }

    // Method to calculate total rent
    public double calculateTotalRent() {
        return officeSpace * rentPerSquareFoot;
    }

    // Method to get building details
    @Override
    public String getBuildingDetails() {
        return super.getBuildingDetails() + "\nOffice Space: " + officeSpace + " sq ft\nRent per Square Foot: " + rentPerSquareFoot;
    }
}

public class Oops25 {
    public static void main(String[] args) {
        // Example usage
        ResidentialBuilding residentialBuilding = new ResidentialBuilding("123 Main St", 10, 50000, 20, 1500);
        System.out.println(residentialBuilding.getBuildingDetails());
        System.out.println("Total Rent: " + residentialBuilding.calculateTotalRent());

        CommercialBuilding commercialBuilding = new CommercialBuilding("456 Market St", 15, 100000, 80000, 20);
        System.out.println(commercialBuilding.getBuildingDetails());
        System.out.println("Total Rent: " + commercialBuilding.calculateTotalRent());
    }
}
