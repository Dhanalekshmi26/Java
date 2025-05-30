/*Create a class Voter with method isEligible(int age) that returns true if age ≥ 18.
In main(), check and print if a person is eligible to vote. */

public class Voter {

    boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Voter v = new Voter();

        int age1 = 20;
        int age2 = 16;

        System.out.println("Age " + age1 + ": Eligible? " + v.isEligible(age1));
        System.out.println("Age " + age2 + ": Eligible? " + v.isEligible(age2));
    }
}
