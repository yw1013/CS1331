/**
 * This class represents the NotEnoughFundsException.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class NotEnoughFundsException extends PaymentFailedException {

    /**
     * Creates a new NotEnoughFundsException with the given message.
     * @param  msg The message of the exception.
     */
    public NotEnoughFundsException(String msg) {
        super(msg);
    }

    /**
     * Creates a new InvalidItemException.
     */
    public NotEnoughFundsException() {
        super();
    }

}
