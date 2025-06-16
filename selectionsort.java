import java.util.*;
public class selectionsort{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the count: ");
    int count = sc.nextInt();

    int []scores = new int[count];
    for(int i=0;i<count;i++){
        System.out.print("The numbers u entered: ");
        scores[i] = sc.nextInt();
    }
    for(int i=0;i<count-1;i++){
        int minINDEX = i;
        for(int j=i+1;j<count;j++){
            if(scores[j]<scores[minINDEX]){
                int temp = scores[j];
                scores[j] = scores[minINDEX];
                scores[minINDEX] = temp;
            }

        }
    }
    for(int numbers:scores){
        System.out.print(" "+numbers);

    }
    sc.close();
    
}
}