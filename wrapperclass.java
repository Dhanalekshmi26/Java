public class wrapperclass{             //To make primitive types act like objects, Java introduced Wrapper Classes.
public static void main(String[] args){

int a = 5;                             // primitive
Integer b = Integer.valueOf(a);        // wrapper (object)
System.out.println(b.toString());
}  
}
