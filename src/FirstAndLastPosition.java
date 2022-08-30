public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] ans = new int[2];
        int[] nums = {1,2,2,3,4};
        int target =2;
        ans[0] = firstOccurrence(nums, target);
        ans[1] = secondOccurrence(nums, target);
        for (int j = 0; j < ans.length; j++) {
            System.out.println(ans[j] + " ");
        }
    }
    private static int secondOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target && (((mid + 1) <= (nums.length - 1)) ? nums[mid + 1] != target : nums[mid] == target))
                return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
    private static int firstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target && (((mid - 1) > -1) ? target != nums[mid - 1] : nums[mid] == target)) return mid;
            else if (nums[mid] >= target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }
}

