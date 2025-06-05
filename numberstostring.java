/*Converts other types (int, float, etc.) to string. */

public class numberstostring {
    public static void main(String[] args){
        int age = 22;
        String msg = String.valueOf(age);
        System.out.println("integer to string: " + msg); 
        float a = 2.5f;
        String A = String.valueOf(a);
        System.out.println("float to string: "+A);
        double d = 34.9;
        String D = String.valueOf(d);
        System.out.println("double to string: "+D);


    }
}
