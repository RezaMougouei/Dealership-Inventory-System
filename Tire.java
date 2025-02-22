public class Tire {
    private int wheelDiameter;
    private int sectionWidth;
    private double price;
    private boolean passengerTire;

    public Tire(int wheelDiameter, int sectionWidth, double price, boolean passengerTire) {
        this.wheelDiameter = wheelDiameter;
        this.sectionWidth = sectionWidth;
        this.price = price;
        this.passengerTire = passengerTire;
    }

    @Override
    public String toString() {
        if (passengerTire) {
            return "Passenger tire with " + wheelDiameter + "\" wheel diameter, " + sectionWidth + " mm. section width, price $" + price;
        } else {
            return "Front tire with " + wheelDiameter + "\" wheel diameter, " + sectionWidth + " mm. section width, price $" + price;
        }
    }
}
