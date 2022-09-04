import java.util.HashMap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(missingPositive(nums));
    }

    private static int missingPositive(int[] nums) {
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            map.put(nums[i], i);
        }
        for (int i = 1; ; i++) {
            if (!map.containsKey(i)) return i;
        }
        //return -1;
    }
}
