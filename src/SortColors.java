import java.util.HashMap;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]) + 1;
                map.put(nums[i],count);
            }else {
                map.put(nums[i],1);
            }
        }
        int j =0;
        for (int key:map.keySet()){
            for(int i=0;i<map.get(key);i++){
                nums[j++] = key;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
