public class ReverseInteger {
    public static void main(String[] args) {
        int x = -153;
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        long sum = 0;
        while (x != 0) {
            sum = sum * 10 + (x % 10);
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) return 0;
            x = x / 10;
        }
        return (int) sum;
    }
}
