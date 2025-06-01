import java.util.*;
public class opeartionsinjava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first_number = sc.nextInt();
        System.out.print("Enter the operator: ");
        char opeartors = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        int second_number = sc.nextInt();
        int result;
        switch(opeartors){
            case '+':
            result = first_number + second_number;
            break;
            case '-':
            result = first_number - second_number;
            break;
            case '*':
            result = first_number * second_number;
            break;
            case '/':
            result = first_number / second_number;
            break;
            case '%':
            result = first_number % second_number;
            break;
            default:
            System.out.println("Invalid operator!");
            return;

        }
        System.out.println("Result: "+ result);

    }
}
