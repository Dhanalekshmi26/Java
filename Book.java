/*Q1: Define a class Book with attributes title and author.
 Create two objects of this class and display their details using a method displayDetails().*/

 class Book{
    int title = 100;
    String author = "Shakespere";
    void displayDetails(){
        System.out.println("title: "+title);
        System.out.println("name of author is: "+author);

    }
    public static void main(String[] args) {
        Book bk = new Book();
        bk.displayDetails();
    }
 }

