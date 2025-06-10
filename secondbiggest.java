public class secondbiggest {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 8, 3, 9,3};

        int biggest = nums[0];
        int secondBiggest = -1;

        // Step 1: Find the biggest
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > biggest) {
                biggest = nums[i];
            }
        }

        // Step 2: Find second biggest (less than biggest)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < biggest) {
                if (nums[i] > secondBiggest) {
                    secondBiggest = nums[i];
                    
                    
                }
            }
            
        }System.out.println(secondBiggest);

       
    }
}
