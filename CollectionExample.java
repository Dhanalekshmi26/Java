
import java.util.ArrayList;

public class CollectionExample{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();

        names.add("nidhi");
        names.add("achu");
        names.add("dwani");
        names.add("dhyan");

        System.out.println("Babies names: ");
        for(String name:names){
            System.out.println(name);
        }
    }
}
