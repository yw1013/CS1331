/**
 * This class represents the Cash.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Cash implements PaymentMethod {

    private double cashOnHand;

    /**
    * Constructor for Cash.
    * @param cashOnHand the total amount of cash on hand
    */
    public Cash(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    /**
    * @param amount price of an item
    */
    public void pay(double amount) throws NotEnoughFundsException {
        if (cashOnHand >= amount) {
            cashOnHand -= amount;
        } else {
            throw new NotEnoughFundsException("There aren’t enough cash");
        }
    }

}
