/*Create a class MathEngine

Add 3 overloaded add() methods:

add(int a, int b)

add(double a, double b)

add(int a, int b, int c)

In main(), create an object and call all 3 methods.*/

public class MathEngine {
    void add(int a , int b){
        System.out.println(a+b);
    }
    void add(double a , double b){
        System.out.println(a+b);
    }
    void add(int a , int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        MathEngine ME  = new MathEngine();
        ME.add(2, 6);
        ME.add(3.2, 2.6);
        ME.add(3, 6, 9);


    }
}
