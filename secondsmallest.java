public class secondsmallest {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 8, 3, 9}; 
        int smallest = nums[2]; // 2
        int biggest = nums[0];  // 10

        int minFiltered = Integer.MAX_VALUE;     //2147483647

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > smallest && nums[i] < biggest) {
                System.out.println(nums[i]); // Just to show
                if (nums[i] < minFiltered) {
                    minFiltered = nums[i];
                }
            }
        }

        if (minFiltered != Integer.MAX_VALUE) {
            System.out.println("Minimum from filtered values: " + minFiltered);
        } else {
            System.out.println("No elements matched the condition.");
        }
    }
}
