/**
 * This class represents the BuzzCard.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class BuzzCard extends Card {

    private String ownerName;
    private double balance;

    /**
    * Constructor for Buzzcard.
    * @param ownerName the name of a card owner
    * @param balance amount of available balance
    */
    public BuzzCard(String ownerName, double balance) {
        super(ownerName, balance);
    }

    /**
    * @param amount price of an item
    */
    public void pay(double amount) throws PaymentFailedException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new NotEnoughFundsException("There aren’t enough funds");
        }
    }

}
