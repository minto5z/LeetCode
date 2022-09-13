import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largeNumber(nums));
    }

    private static String largeNumber(int[] nums) {
        List<Integer> s = new ArrayList<>();
        List<Integer> b= new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if(nums[i]>9){
                b.add(nums[i]);
            }else s.add(nums[i]);
        }
        Collections.reverse(s);
        Collections.reverse(b);

        return "";
    }
}
