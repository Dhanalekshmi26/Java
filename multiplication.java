import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // Input number for multiplication

        for(int i = 1; i <= 10; i++) {
            String result = N + " x " + i + " = " + (N * i);
            System.out.println(result);  // Print the formatted result
        }

        sc.close();
    }
}
