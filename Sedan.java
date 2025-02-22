public class Sedan {
    private String make;
    private String model;
    private String color;
    private int year;
    private double price;

    public Sedan(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sedan: " + year + " " + make + ", " + model + " (" + color + "), price $" + price;
    }

}
