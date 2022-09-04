import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(gap(nums));
    }

    private static int gap(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        if(nums.length==1) return 0;
        for (int i=0;i< nums.length-1;i++){
            int a = nums[i+1]-nums[i];
            max = Math.max(max,a);
        }
        return max;
    }
}
