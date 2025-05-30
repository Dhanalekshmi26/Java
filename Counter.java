/*Create a class Counter with:

A field count initialized to 0.

Method increment() (no args, returns updated count).
Call increment() multiple times and print returned values. */

public class Counter {
    int count=0;
    
    int increment(){
        count++;
        return count;
    }
    public static void main(String[] args) {
        Counter co = new Counter();
        System.out.println(co.increment());
        System.out.println(co.increment());
        System.out.println(co.increment());

    }
}
