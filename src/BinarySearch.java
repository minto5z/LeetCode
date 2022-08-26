public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        int end = nums.length-1;
        int start = 0;
        int index = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target) {
                System.out.println(mid);
                break;
            }
            else if(nums[mid]<target) start = mid +1;
            else end = mid - 1;
        }
        System.out.println(index);
    }
}
