import java.util.*;
public class intostring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a digit: ");
    int N = sc.nextInt();
    String s = Integer.toString(N);
    
    if(s.equals(String.valueOf(N))){
        System.out.println("Good job");
    }else{
        System.out.println("Wrong answer");
    }
    }
}