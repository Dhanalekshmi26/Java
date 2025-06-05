public class Studenttt{

    private int age;                   //hiding data 

    public void setage(int a){        //visible method for setting age 
        age = a ;
    }
    public int getage(){             //visible method for getting/printing age
        return age;
    }
        
    
public static void main(String[] args){
    Studenttt st = new Studenttt();
    st.setage(21);
    System.out.println("age of student is : "+st.getage());

}
}//encapsulation : wrapping data and methods together to keep data protected from unauthorised access 
