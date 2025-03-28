package day33_inheritance_practice;

public class TestMembership {
    public static void main(String[] args) {

        GymMembership gymMembership = new GymMembership("Anna Lee", 50.0,
                8, "12.12.2023", 45632, false,
                true, "LA");
        YogaMembership yogaMembership = new YogaMembership("Sara Lee",
                250.0, 8, "12.12.2022", 78642,
                4, "stella", 40);

        System.out.println("Gym: ");
        System.out.println("Membership total = " + gymMembership.calculateTotalCost());
        System.out.println("Membership renew = " + gymMembership.renewMembership (5));
        gymMembership.upgradeToPersonalTrainer();
        gymMembership.displayGymMembershipInfo();
        System.out.println("Yoga: ");
        System.out.println("Yoga total cost = " + yogaMembership.calculateTotalCost());
        System.out.println("Yoga renew = " + yogaMembership.renewMembership (4));
        System.out.println("Yoga total session= " + yogaMembership.calculateTotalSessions());
        yogaMembership.changeInstructor("Gary");
        yogaMembership.displayYogaMembershipInfo();
    }
}
