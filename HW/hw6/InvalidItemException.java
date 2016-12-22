/**
 * This class represents the InvalidItemException.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class InvalidItemException extends Exception {

    /**
     * Creates a new InvalidItemException with the given message.
     * @param  msg The message of the exception.
     */
    public InvalidItemException(String msg) {
        super("This item is not valid.");
    }

    /**
     * Creates new InvalidItemException.
     */
    public InvalidItemException() {
        super();
    }

}
