import java.util.ArrayList;

public class BookAllowcation {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        int n = 4;
        int m = 2;
        System.out.println(bookAllocation(arr, m, n));
    }
    private static int bookAllocation(ArrayList<Integer> arr, int m, int n) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.size(); i++) {
            end = end + arr.get(i);
        }
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (possibleAnswer(arr, m, n, mid)) {
                res = mid;
                end = mid - 1;
            } else start = mid + 1;
        }
        return res;
    }

    private static boolean possibleAnswer(ArrayList<Integer> arr, int m, int n, int mid) {

        int countStudent = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) {
            if (pageSum + arr.get(i) <= mid) {
                pageSum = pageSum + arr.get(i);
            } else {
                countStudent++;
                if (countStudent > m || arr.get(i) > mid) {
                    return false;
                }
                pageSum = arr.get(i);
            }
        }
        return true;
    }
}
