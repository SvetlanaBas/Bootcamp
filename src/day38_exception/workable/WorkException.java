package day38_exception.workable;

public class WorkException extends Exception{
    public WorkException() {
    }

    public WorkException(String message) {
        super(message);
    }
}
