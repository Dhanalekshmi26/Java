/*Create a class Book with:

One constructor taking title only.

Another constructor taking title and author.
Add method printDetails().
Create both versions of object in main() and call printDetails(). */

public class BookBuying {
    String title;
    String author;


    BookBuying(String title) {
        this.title = title;
        this.author = "None";
    }

        BookBuying(String title,String author){
            this.title = title;
            this.author = author;
        }

        void printDetails(){
            System.out.println(title);
            System.out.println(author);
        }

    
    
    public static void main(String[] args) {
        BookBuying by = new BookBuying("the thunder");
        BookBuying by2 = new BookBuying("the thunder", "reemal");
        by.printDetails();
        by2.printDetails();
        
    }
}
