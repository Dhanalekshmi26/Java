public class Nonprimitives {

    // 1. Custom class should be static if used inside main
    static class Student {
        String name;
        int age;
    }

    public static void main(String[] args) {
        // 2. String example
        String s = "John";
        System.out.println(s);

        // 3. Array example
        int[] marks = {45, 50, 44, 35, 49, 50};
        System.out.println(marks);

        // 4. Object creation – corrected syntax
        Student n = new Student();  // Use 'new' keyword
        n.name = "Meera";
        n.age = 21;

        // Print student info
        System.out.println("Name: " + n.name + ", Age: " + n.age);
    }
}




    
    

