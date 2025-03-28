package day38_exception;

public class TestAgeValidators {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (AgeValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Age validation completed.");
        }
    }

    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be 18 or above.");
        }
    }
}
