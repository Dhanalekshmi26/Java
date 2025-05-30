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
    void showProduct(){
        System.out.println(id);
        System.out.println(name);
    }

    
    public static void main(String[] args) {
        Product po = new Product(31, "ishan");
        po.showProduct();
    }
}
