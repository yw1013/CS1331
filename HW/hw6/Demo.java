import java.time.LocalDate;

/**
 * This class represents the demo.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Demo {

    /**
    * @param args argument that main method is going to take.
    */
    public static void main(String[] args) {

        CheckoutMachine storeName = new CheckoutMachine("TechConvenience");

        LocalDate ld = LocalDate.parse("2016-03-01");

        Cash cash1 = new Cash(10.00);
        Cash cash2 = new Cash(1000.00);
        CreditCard credit1 = new CreditCard("Julie", 10.00, ld);
        CreditCard credit2 = new CreditCard("Harrison", 1000.00, ld);
        BuzzCard buzz1 = new BuzzCard("Kelly", 10.00);
        BuzzCard buzz2 = new BuzzCard("Tony", 1000.00);

        Item groundCoffee = new Item(961.05, 9220570);
        Item ramen12 = new Item(74.84, 12);
        Item macAndCheese5 = new Item(1028.80, 9237204);
        Item frozenPizza = new Item(902.93, 9263670);
        Item energyDrink10 = new Item(546.86, 550759400);

        System.out.println("\nShopping Items\n");

        try {
            storeName.scan(groundCoffee);
        } catch (InvalidItemException ie1) {
            System.out.println("Invalid Item");
        }

        try {
            storeName.scan(ramen12);
        } catch (InvalidItemException ie2) {
            System.out.println("Invalid Item");
        }

        try {
            storeName.scan(macAndCheese5);
        } catch (InvalidItemException ie3) {
            System.out.println("Invalid Item");
        }

        try {
            storeName.scan(frozenPizza);
        } catch (InvalidItemException ie4) {
            System.out.println("Invalid Item");
        }

        try {
            storeName.scan(energyDrink10);
        } catch (InvalidItemException ie5) {
            System.out.println("Invalid Item");
        }

        System.out.println("Total: $" + storeName.getTotalPrice() + "\n");


        storeName.payForCart(cash1);
        storeName.payForCart(cash2);
        // storeName.payForCart(credit1);
        storeName.payForCart(credit2);
        // storeName.payForCart(buzz1);
        storeName.payForCart(buzz2);

    }
}
