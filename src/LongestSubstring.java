import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcd";
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.add(c)) {
                max = Math.max(max, (right - left + 1));
                right++;
            } else {
                while (s.charAt(left) != c) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(c);
                left++;
            }
        }
        System.out.println(max);
    }
}
