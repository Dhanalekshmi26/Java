
public class Nonprimitives{
    static class Student{                     //custom class
        int marks;
        String names;

    }
    public static void main(String[] args){
        String color = "Red";                //string
        System.out.println(color);

        int[] c = {2,4,6,8};               //array
        System.out.println(c);


        Student s = new Student();           //object
        s.marks = 99;
        s.names = "dhanuu";
        System.out.println("Name: " + s.names + ", Age: " + s.marks);
    }
}



    
    

