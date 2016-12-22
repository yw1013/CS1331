/**
 * This class represents the Card.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Card implements PaymentMethod {

    private String ownerName;
    private double balance;

    /**
    * Constructor for Cash.
    * @param ownerName the name of a card owner
    * @param balance amount of available balance
    */
    public Card(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
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
