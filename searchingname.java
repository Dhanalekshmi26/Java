public class searchingname {
    public static void main(String[] args) {
        String[] friends = {"Adeena", "Amal", "Neha", "Rahul"};
        String target_name = "Neha";
        boolean found = false;

        for(int i=0;i<friends.length;i++){
            if(friends[i].equals(target_name)){
                System.out.println("Neha is at position: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Friend not in list");
        }

    }
}
