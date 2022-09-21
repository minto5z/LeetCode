import java.util.*;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = interSection(nums1,nums2);
        for (int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }

    private static int[] interSection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> res = new HashSet<>();
        for (int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        for (int i=0;i< nums2.length;i++){
            if(map.containsKey(nums2[i]))res.add(nums2[i]);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
