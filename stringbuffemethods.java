public class stringbuffemethods {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" Java");
        System.out.println("After append: " + sb);  

        // Insert
        sb.insert(6, "Dhanalekshmi ");
        System.out.println("After insert: " + sb);  

        // Replace
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);  

        // Delete
        sb.delete(3, 15);
        System.out.println("After delete: " + sb);  

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);  

        // Capacity
        System.out.println("Buffer capacity: " + sb.capacity());

        // Length
        System.out.println("Current length: " + sb.length());
    }
}

