public class thiskeyword {
    String name;
    thiskeyword(String name){
        this.name = name;
    }
    void display(){
        System.out.printf("name of baby is: %s", name);
    }
    public static void main(String[] args) {
        thiskeyword key = new thiskeyword("IVA");
        key.display();
        
    }
}
