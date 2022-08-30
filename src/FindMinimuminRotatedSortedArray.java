public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(minimumElement(nums));
    }

    private static int minimumElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= nums[0]) {
                start = mid + 1;
                min = Math.min(min, nums[0]);
            }
            else end = mid;
        }
        return Math.min(min, nums[start]);
    }
}
