public class stringsmethodDemo {
    public static void main(String[] args) {
        // 1️ substring(start, end)
        String text = "HelloWorld";
        String part = text.substring(0, 5);  // from index 0 to 4
        System.out.println("Substring (0 to 5): " + part);  

        // 2️ isEmpty()
        String emptyText = "";
        System.out.println("Is emptyText empty? " + emptyText.isEmpty());  

        // 3️ split()
        String fruits = "apple,banana,orange";
        String[] fruitArray = fruits.split(","); // split at commas
        System.out.println("Fruits after split:");
        for(String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 4️ join()
        String joined = String.join(" - ", "Java", "Python", "C++");
        System.out.println("Joined languages: " + joined); 

        // 5️ compareTo()
        String a = "apple";
        String b = "banana";
        int result = a.compareTo(b); // compare a to b (dictionary order)
        System.out.println("compareTo result (apple vs banana): " + result); 

        // 6️s toCharArray()
        String word = "Dog";
        char[] letters = word.toCharArray();
        System.out.println("Characters in 'Dog':");
        for(char c : letters) {
            System.out.println(c);
        }
    }
}
