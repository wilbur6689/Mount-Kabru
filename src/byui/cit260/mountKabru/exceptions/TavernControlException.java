package byui.cit260.mountKabru.exceptions;

/**
 * Created by badgero1234 on 3/22/16.
 */
public class TavernControlException extends Exception{

    public TavernControlException() {
    }

    public TavernControlException(String message) {
        super(message);
    }

    public TavernControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TavernControlException(Throwable cause) {
        super(cause);
    }

    public TavernControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
