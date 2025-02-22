public class MiniVan {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean covered;
    private String carries;

    public MiniVan (String make, String model, int year, double price, boolean covered, String carries) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.covered = covered;
        this.carries = carries;
    }

    @Override
    public String toString() {
        if (covered) {
            return "Covered MiniVan: " + year + " " + make + ", " + model + ", carries " + carries + ", price $" + price;
        } else {
            return "MiniVan: " + year + " " + make + ", " + model + ", carries " + carries + ", price $" + price;
        }
    }
}
