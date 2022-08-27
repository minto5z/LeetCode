import java.util.Objects;

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "abbac";
        int l, h;
        int start = 0, end = 1;
        for (int i = 0; i < s.length(); i++) {
            l = i;
            h = i;
            while (l >= 0 && h < s.length() &&
                    Objects.equals(s.charAt(l), s.charAt(h))) {
                if (h - l + 1 > end) {
                    start = l;
                    end = h - l + 1;
                }
                l--;
                h++;
            }
            l = i;
            h = i + 1;
            while (l >= 0 && h < s.length() &&
                    Objects.equals(s.charAt(l), s.charAt(h))) {
                if (h - l + 1 > end) {
                    start = l;
                    end = h - l + 1;
                }
                l--;
                h++;
            }
        }
        System.out.println(s.substring(start, end + start));
    }
}
