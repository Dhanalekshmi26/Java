class mother{
    public void mybehaviour(){
        System.out.print("i am very kind and down earth person");
    }
}
class child extends mother{
    public void me() {
        System.out.print("i am mamma's boy so ....");
    }
}

public class Main{
    public static void main(String[] args) {
        child c = new child();
        c.me();
        c.mybehaviour();
        
        
    }
}  //inheritance: a process inheriting properties and behaviour from another class