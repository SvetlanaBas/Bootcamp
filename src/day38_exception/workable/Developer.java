package day38_exception.workable;

public class Developer extends Employee implements Workable {
    private int linesOfCode;

    public Developer(String name, int age, int linesOfCode) {
        super(name, age);
        this.linesOfCode = linesOfCode;
    }
    @Override
    public void doWork() throws WorkException {
        if (linesOfCode <= 0) {
            throw new WorkException("No code written");
        } else {
            System.out.println("Wrote " + linesOfCode + " lines of code today");
        }
    }
}
