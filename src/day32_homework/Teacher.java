package day32_homework;

public class Teacher extends Person{
   private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("Teaching " + subject);
    }

    public void getSubject() {
        System.out.println("Subject I teach is " + subject);
    }
}
