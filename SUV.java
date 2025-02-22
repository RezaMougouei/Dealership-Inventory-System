public class SUV {
    private String make;
    private String model;
    private String color;
    private int year;
    private double price;
    private boolean allWheelDrive;

    public SUV(String make, String model, String color, int year, double price, boolean allWheelDrive) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.allWheelDrive = allWheelDrive;
    }

    @Override
    public String toString() {
        if (allWheelDrive) {
            return "AWD SUV: " + year + " " + make + ", " + model + " (" + color + "), price $" + price;
        } else {
            return "SUV: " + year + " " + make + ", " + model + " (" + color + "), price $" + price;
        }
    }

}
