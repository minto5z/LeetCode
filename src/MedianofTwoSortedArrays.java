public class MedianofTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        System.out.println(sortedArrays(nums1, nums2));
    }

    private static double sortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums = new int[m + n];
        int i = 0;
        int j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i];
                i++;
            } else {
                nums[k++] = nums2[j];
                j++;
            }
        }
        while (j < n) {
            nums[k++] = nums2[j];
            j++;
        }
        while (i < m) {
            nums[k++] = nums1[i];
            i++;
        }
        if ((m + n) % 2 != 0) {
            int mid = (m + n) / 2;
            return nums[mid];
        } else {
            int mid = (m + n) / 2;
            double p = nums[mid];
            double q = nums[mid - 1];
            return (p + q) / 2;
        }
    }
}
