import java.io.*;

class Student implements Serializable {
    String name = "Dhanalekshmi";
    int age = 22;
}

public class Demoo{
    public static void main(String[] args) throws Exception {
    Student s = new Student();

    // Serialization
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
    out.writeObject(s);
    out.close();

    // Deserialization
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
    Student s2 = (Student) in.readObject();
    System.out.println("Name: " + s2.name);
    System.out.println("Age: " + s2.age);
    in.close();
}

    }

