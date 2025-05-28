/*Q5: Write a function greet() inside a class Greeting that prints "Hello, Welcome!" and is called using an object. */
public class Greeting {
    void greet(){
        System.out.println("Hello, Welcome!");
    }
    public static void main(String[] args) {
       Greeting g = new Greeting();
       g.greet();                //this question is Without Argument Without Return
    }
}
