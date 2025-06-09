public class biggestnumber {
    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};

        int max = nums.length-1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("biggest element in array: " + max);
    }
}
