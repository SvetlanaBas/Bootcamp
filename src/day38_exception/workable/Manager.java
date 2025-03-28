package day38_exception.workable;

public class Manager extends Employee implements Workable {
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }

    @Override
    public void doWork() throws WorkException {
        if (teamSize <= 0) {
            throw new WorkException("Invalid size");
        } else {

            System.out.println("Managing team: " + teamSize + " people");
        }
    }
}
