public class Nonprimitives {

    // 1. Custom class should be static if used inside main
    static class Student {
        String name;
        int age;
    }

    public static void main(String[] args) {
        // 2. String type
        String s = "John";
        System.out.println(s);

        // 3. Array type
        int[] marks = {45, 50, 44, 35, 49, 50};
        // You need to print array using a loop or Arrays.toString
        System.out.println(java.util.Arrays.toString(marks));

        // 4. Object creation – corrected syntax
        Student n = new Student();  // Use 'new' keyword
        n.name = "Meera";
        n.age = 21;

        
        System.out.println("Name: " + n.name + ", Age: " + n.age);
    }
}
