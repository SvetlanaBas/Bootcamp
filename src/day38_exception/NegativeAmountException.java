package day38_exception;

public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException() {
    }

    public NegativeAmountException(String message) {
        super(message);
    }
}
