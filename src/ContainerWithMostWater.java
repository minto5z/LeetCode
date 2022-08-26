public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left) * min);
            if (height[left] < height[right]) left++;
            else right--;
        }
        System.out.println(max);
    }
}
