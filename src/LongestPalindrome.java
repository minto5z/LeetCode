import java.util.*;

import static java.util.stream.Collectors.toMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceiv" +
                "edandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldof" +
                "tzhatwarWehavecometodedicpateaportionofthatfieldasafinalresting" +
                "placeforthosewhoheregavetheirlivesthatthatnationmightliveItisalt" +
                "ogetherfangandproperthatweshoulddothisButinalargersensewecannotde" +
                "dicatewecannotconsecratewecannothallowthisgroundThebravelmenlivi" +
                "nganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwer" +
                "toaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesa" +
                "yherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertob" +
                "ededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfar" +
                "sonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremaini" +
                "ngbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwh" +
                "ichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedead" +
                "shallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandtha" +
                "tgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String t = "ccc";
        System.out.println(palindrome(t));
    }

    private static int palindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), count);
            } else map.put(s.charAt(i), 1);
        }
        boolean isCheck = false;
        int result = 0;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) result = result + map.get(c);
            else {
                if (!isCheck) {
                    result = result + map.get(c);
                    isCheck = true;
                }else
                    result+= map.get(c)-1;
            }
        }
        return result;
    }
}
