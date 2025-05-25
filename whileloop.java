import java.util.Scanner;
public class whileloop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            System.out.println("please type word and press enter to display! , and for exit type exit");
            input = sc.nextLine();
        }
        
    }
}
