/*Q4:
Create a class Responder with a method getGreeting() that does not take any arguments but returns a greeting 
string "Good Morning!".In main(), call getGreeting() using an object and print the returned value. */
public class Responder {
    String getGreeting(){
        return "Good Morning!";
    }
    public static void main(String[] args) {
        Responder rp = new Responder();
        System.out.println(rp.getGreeting());        //this question is Without Argument With Return
        
    }
}
