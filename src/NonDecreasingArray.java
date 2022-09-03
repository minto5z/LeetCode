public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 2, 3};
        System.out.println(nonDecreasing(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static boolean nonDecreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (count == 1) return false;
                if (i < 2 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
                count = 1;
            }
        }
        return true;
    }
}
