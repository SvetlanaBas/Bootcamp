package day38_exception;

public class BadInputException extends RuntimeException {
    public BadInputException(){
    }
    public BadInputException(String message) {
        super(message);
    }
}

