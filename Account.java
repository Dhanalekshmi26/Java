/*Create a class Account with a private data member balance.
Provide public methods setBalance(double b) and getBalance() to set and retrieve the balance.
Demonstrate how encapsulation works by accessing balance only through these methods.*/


public class Account {
    private double balance;

    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setBalance(10.8);
        System.out.println("current balance is: "+ac.getBalance());

    }
}
