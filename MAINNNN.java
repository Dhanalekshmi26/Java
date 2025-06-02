/*personte a base class Animal with a protected member variable name.

Create a derived class Dog that extends Animal. Inside Dog, 
create a public method setName(String n) to set the name and displayName() to display the name.

Create a separate class Person with a private member variable age. 
Provide public methods setAge(int a) and getAge() to set and return the age.

In the main method, create objects of Dog and Person, use their methods to set and display the values. */
class Animal {
    protected String name;
    
}
class Dog extends Animal{
    public void setName(String n){
        name= n;
    }
    void displayName(){
        System.out.println("Dog's Name: "+name);
    }

}
class personmm{
  private int age;                   //hiding data 

    public void setage(int a){        //visible method for setting age 
        age = a ;
    }
    public int getage(){             //visible method for getting/printing age
        return age;
    }}
public class MAINNNN{
    public static void main(String[] args) {
    Dog d = new Dog();
    personmm p = new personmm();
    d.setName("rahul");
    d.displayName();
    p.setage(25);
    System.out.println("Person's Age: "+p.getage());
}}


