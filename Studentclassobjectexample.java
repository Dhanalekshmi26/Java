public class Studentclassobjectexample {                                         //class
        String name = "Meera";                                                  //data members (variables)
        int age = 23;                                                          
        double grade = 99.9;                                                 
    void displayDetails(){                                                   //created user function inside class
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);

    }
    public static void main(String[] args) {
        Studentclassobjectexample st = new Studentclassobjectexample();           //here object creation of class
        st.displayDetails();                                                     //calling function
    }                                                                           //st is a reference variable

}
