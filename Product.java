/*Create a class Product with:

Fields id, name.

Constructor with parameters id, name.
Use this to set instance variables.
Add method showProduct(). */

public class Product {
    int id ;
    String name;

    Product(int id,String name) {
        this.id = id;
        this.name = name;

    }
    void showProduct() {
    System.out.println("Product ID: " + id);
    System.out.println("Product Name: " + name);
}


    
    public static void main(String[] args) {
        Product po = new Product(31, "colgate paste");
        po.showProduct();
    }
}
