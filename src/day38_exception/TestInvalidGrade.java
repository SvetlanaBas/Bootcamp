package day38_exception;

import java.util.Scanner;

public class TestInvalidGrade {
    public static void main(String[] args) {
        try {
            submitGrade(105);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void submitGrade(int grade) throws InvalidGradeException {
        if (grade > 100 || grade < 0) {
            throw new InvalidGradeException("Invalid grade!");
        }
    }
}
