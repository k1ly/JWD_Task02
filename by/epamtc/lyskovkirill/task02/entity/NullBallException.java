package by.epamtc.lyskovkirill.task02.entity;

public class NullBallException extends Exception {

    public NullBallException() {
        super();
    }

    public NullBallException(String message) {
        super(message);
    }

    public NullBallException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullBallException(Throwable cause) {
        super(cause);
    }
}
