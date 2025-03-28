package day38_exception;

public class AgeValidationException extends Exception {
    public AgeValidationException() {
    }

    public AgeValidationException(String message) {

        super(message);
    }
}
