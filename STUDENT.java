/*Create a class Student with two data members: name and rollNumber.
Write a Java program to:

Create an object of Student

Assign values to its data members

Display the student's details using a method */


public class STUDENT {
    String name;
    int rollNumber;
    STUDENT(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void display(){
        System.out.println("name of student is: "+name);
        System.out.println("roll number of student is: "+rollNumber);

    }
    public static void main(String[] args) {
        STUDENT s = new STUDENT("ravi", 31);
        s.display();
        
        
    }
    
}
