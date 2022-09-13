import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        String digits = "2345";
        List<String> result = phoneNumber(digits);
        for (int i = 0; i < result.size(); i++)
            System.out.print(result.get(i) + " ");
    }

    private static List<String> phoneNumber(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        char[] digitList = digits.toCharArray();
        List<String> res = new ArrayList<>();
        if (digitList.length == 1) {
            for (int i = 0; i < map.get(digitList[0] - '0').length(); i++) {
                res.add(String.valueOf(map.get(digitList[0] - '0').charAt(i)));
            }
            return res;
        }
        if (digitList.length == 2) {
            for (int i = 0; i < digitList.length - 1; i++) {
                int first = digitList[i] - '0';
                char[] fstStr = map.get(first).toCharArray();
                for (int j = i + 1; j < digitList.length; j++) {
                    int second = digitList[j] - '0';
                    char[] secStr = map.get(second).toCharArray();
                    for (int m = 0; m < fstStr.length; m++) {
                        for (int n = 0; n < secStr.length; n++) {
                            res.add(Character.toString(fstStr[m]) + Character.toString(secStr[n]));
                        }
                    }
                }
            }
        }
        if (digitList.length == 3) {
            for (int i = 0; i < digitList.length - 2; i++) {
                int first = digitList[i] - '0';
                char[] fstStr = map.get(first).toCharArray();
                for (int j = i + 1; j < digitList.length - 1; j++) {
                    int second = digitList[j] - '0';
                    char[] secStr = map.get(second).toCharArray();
                    for (int k = j+1; k < digitList.length; k++) {
                        int third = digitList[k] - '0';
                        char[] thirdStr = map.get(third).toCharArray();
                        for (int m = 0; m < fstStr.length; m++) {
                            for (int n = 0; n < secStr.length; n++) {
                                for (int o = 0; o < thirdStr.length; o++) {
                                    res.add(Character.toString(fstStr[m]) +
                                            Character.toString(secStr[n]) +
                                            Character.toString(thirdStr[o]));
                                }
                            }
                        }
                    }
                }
            }
        }
        if (digitList.length == 4) {
            for (int i = 0; i < digitList.length - 3; i++) {
                int first = digitList[i] - '0';
                char[] fstStr = map.get(first).toCharArray();
                for (int j = i + 1; j < digitList.length - 2; j++) {
                    int second = digitList[j] - '0';
                    char[] secStr = map.get(second).toCharArray();
                    for (int k = j+1; k < digitList.length - 1; k++) {
                        int third = digitList[k] - '0';
                        char[] thirdStr = map.get(third).toCharArray();
                        for (int l = k+1; l < digitList.length; l++) {
                            int four = digitList[l] - '0';
                            char[] fourStr = map.get(four).toCharArray();
                            for (int m = 0; m < fstStr.length; m++) {
                                for (int n = 0; n < secStr.length; n++) {
                                    for (int o = 0; o < thirdStr.length; o++) {
                                        for (int p = 0; p < fourStr.length; p++) {
                                            res.add(Character.toString(fstStr[m]) +
                                                    Character.toString(secStr[n]) +
                                                    Character.toString(thirdStr[o])+
                                                    Character.toString(fourStr[p]));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
