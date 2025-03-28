package day38_exception;

public class TestEmptyFieldException {
    public static void main(String[] args) {
        try {
            submitForm("Kate","");
        } catch (Exception e){
            System.out.println("Exception handled");
        } finally {
            System.out.println("Work!");
        }
    }
    public static void submitForm(String name, String email) throws EmptyFieldException{
        if (name.isEmpty() || email.isEmpty()){
            throw new EmptyFieldException("Name and Email fields cannot be empty");
        }
    }
}
