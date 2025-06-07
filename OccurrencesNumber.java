public class OccurrencesNumber {
    public static void main(String[] args) {
        int[] products = {5, 3, 7, 3, 9, 3, 2};
        boolean found = false;
        for(int i=0;i<products.length;i++){
            if(products[i] == 3){
                System.out.println("Product ID 3 found at index: "+i);
                found = true;
            }
        }if(!found){
            System.out.println("Product ID not found.");
        }

    }
}
