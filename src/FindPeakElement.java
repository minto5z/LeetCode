public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(insertPosition(nums));
    }

    private static int insertPosition(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[(mid + 1) > nums.length - 1 ? mid : mid + 1]) {
                start = mid + 1;
            } else if (nums[mid] < nums[mid - 1 > -1 ? mid - 1 : mid]) {
                end = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
}