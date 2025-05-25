public class ifelseifelse{                         //selection statements are the statements that choosing between options
    public static void main(String[] args){   
        
        int age = -1;
        if(age>18){                                             //if if-else if-else-if are some of the selection statements
            System.out.println("adult person must vote");
        }
        else if(age>=18){
            System.out.println("able to vote");
        }
        else if(age<18 && age>=0){
            System.out.println("not allowed for voting");
        }
        else{
            System.out.println("some error pease check again");
        }

    }
}
