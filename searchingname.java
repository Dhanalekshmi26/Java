public class searchingname {
    public static void main(String[] args) {
        String[] friends = {"Adeena", "Amal", "Neha", "Rahul"};
        String target_name = "Adeena";
        boolean found = false;

        for(int i=0;i<friends.length;i++){
            if(friends[i].equals(target_name)){
                System.out.println("Neha is at position: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in list");
        }

    }
}
