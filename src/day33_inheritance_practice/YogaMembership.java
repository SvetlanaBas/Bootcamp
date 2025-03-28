package day33_inheritance_practice;

public class YogaMembership extends Membership {
    private int sessionPerWeek;
    private String instructorName;
    private int sessionDuration;

    public YogaMembership(String memberName, double monthlyFee, int duration,
                          String registrationDate, int membershipId, int sessionPerWeek,
                          String instructorName, int sessionDuration) {
        super(memberName, monthlyFee, duration, registrationDate, membershipId);
        this.sessionPerWeek = sessionPerWeek;
        this.instructorName = instructorName;
        this.sessionDuration = sessionDuration;
    }

    public int getSessionPerWeek() {
        return sessionPerWeek;
    }

    public void setSessionPerWeek(int sessionPerWeek) {
        this.sessionPerWeek = sessionPerWeek;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getSessionDuration() {
        return sessionDuration;
    }

    public void setSessionDuration(int sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    public double calculateTotalSessions() {
        return sessionPerWeek * 4 * sessionDuration;
    }

    public void changeInstructor(String newInstructor) {
        this.instructorName = newInstructor;
        System.out.println("Instructor changed to: " + newInstructor);
    }

    public void displayYogaMembershipInfo() {
        System.out.println("Yoga Membership Details:");
        System.out.println("Member Name: " + super.getMemberName());
        System.out.println("Monthly Fee: " + super.getMonthlyFee());
        System.out.println("Duration: " + super.getDuration() + " months");
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("Sessions Per Week: " + sessionPerWeek);
        System.out.println("Total Sessions: " + calculateTotalSessions());
        System.out.println("Instructor Name: " + instructorName);
        System.out.println("Session Duration: " + sessionDuration + " minutes");
    }
}
