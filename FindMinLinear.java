public class FindMinLinear {
    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Smallest element in array: " + min);
    }
}
