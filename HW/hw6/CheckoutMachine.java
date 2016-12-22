import java.util.ArrayList;
/**
 * This class represents the Checkout Machine.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class CheckoutMachine extends Exception {

    private String storeName;
    private ArrayList<Item> validItems;
    private ArrayList<Item> cart;
    private boolean bool;

    /**
    * Constructor for CheckoutMachine.
    * @param storeName name of the store.
    */
    public CheckoutMachine(String storeName) {
        this.storeName = storeName;
        cart = new ArrayList<Item>();

        try {
            validItems = Server.getValidItems();
        } catch (ServerException se1) {
            System.out.println("Server Error\n");
        }

        try {
            if (!(Server.isStoreNameValid(this.storeName))) {
                throw new WrongStoreError("Wrong Store\n");
            }
        } catch (ServerException se2) {
            System.out.println("Server Error\n");
        }
    }

    /**
    * @param item a item
    */
    public void scan(Item item) throws InvalidItemException {
        bool = true;
        for (Item vItem : validItems) {
            if (vItem.equals(item)) {
                cart.add(vItem);
                bool = false;
            }
        }
        if (bool) {
            throw new InvalidItemException("Invalid item\n");
        }
    }

    /**
    * @return totalPrice
    */
    public double getTotalPrice() {
        double total = 0.0;
        for (Item validItem : cart) {
            total += validItem.getPrice();
        }
        return total;
    }

    /**
    * @param method is a method for paying
    */
    public void payForCart(PaymentMethod method) {
        try {
            method.pay(getTotalPrice());
            cart.removeAll(cart);
            System.out.println("DONE\n");
        } catch (PaymentFailedException pe) {
            System.out.println("Payment failure\n");
        }

    }

}
