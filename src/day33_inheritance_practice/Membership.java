package day33_inheritance_practice;

public class Membership {
   private String memberName;
    private double monthlyFee;
    private int duration;
    private String registrationDate;
    private int membershipId;

    public Membership(String memberName, double monthlyFee, int duration, String registrationDate, int membershipId) {
        this.memberName = memberName;
        this.monthlyFee = monthlyFee;
        this.duration = duration;
        this.registrationDate = registrationDate;
        this.membershipId = membershipId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public double calculateTotalCost() {
        return monthlyFee * duration;
    }

    public int renewMembership(int additionalMonths) {
        return duration + additionalMonths;
    }
}

