package day38_exception;

public class InvalidGradeException extends Exception{
    public InvalidGradeException() {
    }

    public InvalidGradeException(String message) {
        super(message);
    }
}
