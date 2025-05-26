import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File doesn't exist");
        }
    }
}

