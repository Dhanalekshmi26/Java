import java.util.*;

public class dynamicarrya{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of marks you want to display: ");
        int size = sc.nextInt();

        int []marks = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Your entered marks "+(i)+": ");
            marks[i] = sc.nextInt();
        }
        for(int nums:marks){
            System.out.print(" "+nums);
        }
        sc.close();
    }
    
}