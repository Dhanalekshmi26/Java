public class FirstRepeating {
    public static void main(String[] args) {
        int[] nums = {3,4,2, 9, 7, 1, 4};
        boolean found = false;
        
        for (int i = 0; i < nums.length; i++) {
    for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
            System.out.println("First repeating number is " + nums[i] + " at index " + i);
            found = true;
            break;
        }
    }
  if(found){
                    break;
            }
        }
        if (!found){
            System.out.println("No repeating numbers found.");
        }

    }
}
