import java.util.Locale;

public class AutoPark {
    private String name;

    private Sedan[] sedans = new Sedan[2];
    private SUV[] suvs = new SUV[2];
    private Truck[] trucks = new Truck[2];
    private MiniVan[] miniVans = new MiniVan[2];
    private Tire[] tires = new Tire[2];


    public AutoPark(String name) {
        this.name = name;

        // sedans
        sedans[0] = new Sedan("Honda", "Accord", "White", 2019, 20000.0);
        sedans[1] = new Sedan("Toyota", "Camry", "Gray", 2023, 32000.0);

        // SUVs
        suvs[0] = new SUV("Ford", "Explorer", "Blue", 2022, 35000.0, true);
        suvs[1] = new SUV("Dodge", "Journey", "Red", 2018, 12000.0, false);

        // trucks
        trucks[0] = new Truck("RAM", "1500", 2022, 55000.0, true, "goods");
        trucks[1] = new Truck("Nissan", "Frontier", 2016, 23000.0, false, "equipment");

        // minivans
        miniVans[0] = new MiniVan("Mercedes-Benz", "Sprinter", 2024, 65000.0, true, "goods");
        miniVans[1] = new MiniVan("Chevrolet", "Express", 2019, 19000.0, false, "equipment");

        // tires
        tires[0] = new Tire(12, 35, 400.0, true);
        tires[1] = new Tire(8, 45, 350.0, false);
    }

    public void displayItems() {
        System.out.println("The Revv-tastic Auto Oasis inventory includes:");
        System.out.println();

        for (int i=0; i < sedans.length; i++) {
            System.out.println(sedans[i].toString());
        }
        System.out.println();
        for (int i=0; i < suvs.length; i++) {
            System.out.println(suvs[i].toString());
        }
        System.out.println();
        for (int i=0; i < trucks.length; i++) {
            System.out.println(trucks[i].toString());
        }
        System.out.println();
        for (int i=0; i < miniVans.length; i++) {
            System.out.println(miniVans[i].toString());
        }
        System.out.println();
        for (int i=0; i < tires.length; i++) {
            System.out.println(tires[i].toString());
        }
    }

    public boolean searchItem(String search) {
        search = search.toLowerCase();

        for (Sedan sedan : sedans) {
            if (sedan.toString().toLowerCase().contains(search)) return true;
        }
        for (SUV suv : suvs) {
            if (suv.toString().toLowerCase().contains(search)) return true;
        }
        for (Truck truck : trucks) {
            if (truck.toString().toLowerCase().contains(search)) return true;
        }
        for (MiniVan miniVan : miniVans) {
            if (miniVan.toString().toLowerCase().contains(search)) return true;
        }
        for (Tire tire : tires) {
            if (tire.toString().toLowerCase().contains(search)) return true;
        }

        return false;
    }


}
