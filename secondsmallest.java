public class secondsmallest {
    public static void main(String[] args) {
        int[] nums = {10,20,30};

        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;

        // Step 1: Find the smallest
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        // Step 2: Find second smallest (greater than smallest)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > smallest && nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }
        }

        // Output
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest found.");
        } else {
            System.out.println("Second smallest is: " + secondSmallest);
        }
    }
}
