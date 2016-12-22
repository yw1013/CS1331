/**
 * This class represents the WrongStoreError.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class WrongStoreError extends Error {

    /**
     * Creates a new WrongStoreError with the given message.
     * @param  msg The message of the exception.
     */
    public WrongStoreError(String msg) {
        super(msg);
    }

    /**
     * Creates a new WrongStoreError.
     */
    public WrongStoreError() {
        super();
    }

}
