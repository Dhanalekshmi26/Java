import java.util.Scanner;
public class Solution {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }
        else {
            if(N>=2 && N<=5){
              System.out.println("Not Weird");  
            }
        else if (N>=6 && N<20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }}
        sc.close();
    }
}/*Given an integer, , perform the following conditional actions:

If n is  odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 19, print Weird
If n is even and greater than 19, print Not Weird */