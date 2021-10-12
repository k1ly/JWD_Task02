package by.epamtc.lyskovkirill.task02.entity;

public class BasketOverflowException extends Exception {

    public BasketOverflowException() {
        super();
    }

    public BasketOverflowException(String message) {
        super(message);
    }

    public BasketOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketOverflowException(Throwable cause) {
        super(cause);
    }
}
