package day28_class_and_object;

public class Main4 {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.fullName = "James De";
        employee1.DOB = "APRIL 17,1986";
        employee1.age = 35;
        employee1.placeOfBirth = "kyrgyzstan";
        employee1.phoneBook = 756456789;

        employee1.degree();

        Employee employee2 = new Employee();
        employee2.fullName = "Janell lee";
        employee2.DOB = "May3 ,1986";
        employee2.age = 45;
        employee2.placeOfBirth = "UTAH";
        employee2.phoneBook = 334456789;

        employee2.openAvailability();

        Employee employee3 = new Employee();
        employee3.fullName = "Kate wok";
        employee3.DOB = "Decemeber 6.1987";
        employee3.age = 35;
        employee3.placeOfBirth = "los angeles";
        employee3.phoneBook = 850456789;

        employee3.printInfo();
        employee2.printInfo();
        employee1.printInfo();
    }
}

