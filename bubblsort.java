import java.util.*;
public class bubblsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();

        int []scores = new int[count];
        for(int i=0;i<count;i++){
            System.out.print("you entered marks "+(i)+": ");
            scores[i] = sc.nextInt();
        }
        for(int i=0;i<count-1;i++){
            for(int j=0;j<count-1-i;j++){
                if(scores[j]>scores[j+1]){
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }
        for(int numbers:scores){
            System.out.print(" "+numbers);
        }
        sc.close();
    }
}
