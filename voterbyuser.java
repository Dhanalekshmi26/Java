import java.util.*;
public class voterbyuser {
    boolean isEligible(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voter v = new Voter();
        System.out.print("Enter 1st Age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter 2nd Age: ");
        int age2 = sc.nextInt();
        System.out.println("Age " + age1 + ": Eligible? " + v.isEligible(age1));
        System.out.println("Age " + age2 + ": Eligible? " + v.isEligible(age2));
    }
    }

