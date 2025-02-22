/*
My Name: Mohammadreza Mougouei
ID#101330696
COMP1006E
 */

public class AutoParkTester {
    public static void main(String[] args) {
        AutoPark park = new AutoPark("Revv-tastic Auto Oasis");

        park.displayItems();

        String search = "";
        while (!search.equalsIgnoreCase("quit")) {
            System.out.println();
            System.out.print("Enter a string to search ('quit' to stop): ");
            search = System.console().readLine();

            if (search.equalsIgnoreCase("quit")) {
                break;
            }

            if (park.searchItem(search)) {
                System.out.println("There is a matching item available in our inventory.");
            } else {
                System.out.println("No such item is available in our inventory.");
            }
        }
    }
}
