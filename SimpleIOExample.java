import java.io.*;

public class SimpleIOExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example.txt"); // File may not exist
            int data = fr.read();
            System.out.println("First character: " + (char)data);
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);// using e to print the error
            System.out.println(e); 
        }
        
    }
}
