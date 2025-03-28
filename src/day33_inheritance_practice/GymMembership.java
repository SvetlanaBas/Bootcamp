package day33_inheritance_practice;

public class GymMembership extends Membership{
    private boolean personalTrainerIncluded;
    private boolean lockerIncluded;
    private String gymLocation;

    public GymMembership(String memberName, double monthlyFee,
                         int duration, String registrationDate, int membershipId,
                         boolean personalTrainerIncluded, boolean lockerIncluded, String gymLocation) {
        super(memberName, monthlyFee, duration, registrationDate, membershipId);
        this.personalTrainerIncluded = personalTrainerIncluded;
        this.lockerIncluded = lockerIncluded;
        this.gymLocation = gymLocation;
    }

    public boolean isPersonalTrainerIncluded() {
        return personalTrainerIncluded;
    }

    public void setPersonalTrainerIncluded(boolean personalTrainerIncluded) {
        this.personalTrainerIncluded = personalTrainerIncluded;
    }

    public boolean isLockerIncluded() {
        return lockerIncluded;
    }

    public void setLockerIncluded(boolean lockerIncluded) {
        this.lockerIncluded = lockerIncluded;
    }

    public String getGymLocation() {
        return gymLocation;
    }

    public void setGymLocation(String gymLocation) {
        this.gymLocation = gymLocation;
    }

    public void upgradeToPersonalTrainer() {
        if (!personalTrainerIncluded) {
            personalTrainerIncluded = true;
            System.out.println("Personal trainer added to your membership.");
        } else {
            System.out.println("Personal trainer is already included.");
        }
    }

    public void displayGymMembershipInfo() {
        System.out.println("Gym Membership Details:");
        System.out.println("Member Name: " + super.getMemberName());
        System.out.println("Monthly Fee: " + super.getMonthlyFee());
        System.out.println("Duration: " + super.getDuration() + " months");
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("Personal Trainer Included: " + personalTrainerIncluded);
        System.out.println("Locker Included: " + lockerIncluded);
        System.out.println("Gym Location: " + gymLocation);
    }
}
