public class Truck {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean heavyDuty;
    private String carries;

    public Truck (String make, String model, int year, double price, boolean heavyDuty, String carries) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.heavyDuty = heavyDuty;
        this.carries = carries;
    }

    @Override
    public String toString() {
        if (heavyDuty) {
            return "Heavy-duty Truck: " + year + " " + make + ", " + model + ", carries " + carries + ", price $" + price;
        } else {
            return "Truck: " + year + " " + make + ", " + model + ", carries " + carries + ", price $" + price;
        }
    }
}