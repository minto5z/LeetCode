public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainWater(height));
    }

    private static int rainWater(int[] height) {
        int min;
        int max = Integer.MIN_VALUE;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        for (int i = 0; i <height.length; i++) {
            max = Math.max(max, height[i]);
            left[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            right[i] = max;
        }
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            min = Math.min(left[i], right[i]);
            ans = ans + (min - height[i]);
        }
        return ans;
    }
}
