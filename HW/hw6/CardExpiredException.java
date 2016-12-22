import java.time.LocalDate;

/**
 * This class represents the CardExpiredException.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class CardExpiredException extends PaymentFailedException {

    /**
     * Creates a new PaymentFailedException with the given message.
     * @param  msg The message of the exception.
     */
    public CardExpiredException(String msg) {

        super(msg);
    }

    /**
     * Creates a new PaymentFailedException.
     */
    public CardExpiredException() {
        super();
    }

}
