import java.time.LocalDate;

/**
 * This class represents the CreditCard.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class CreditCard extends Card {

    private String ownerName;
    private double balance;
    private LocalDate expirationDate;

    /**
    * Constructor for CreditCard.
    * @param ownerName the name of a card owner
    * @param balance amount of available balance
    * @param expirationDate expiration date of credit card
    */
    public CreditCard(String ownerName, double balance,
                        LocalDate expirationDate) {
        super(ownerName, balance);
        this.expirationDate = expirationDate;
    }

    /**
    * @param amount is a price of an item
    */
    public void pay(double amount) throws PaymentFailedException {
        LocalDate today = LocalDate.now();
        if (today.isBefore(expirationDate)) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                throw new NotEnoughFundsException("There aren’t enough funds");
            }
        } else {
            throw new CardExpiredException("Card Expired: "
                                            + expirationDate.toString());
        }
    }

}
