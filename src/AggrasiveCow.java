import java.util.ArrayList;

public class AggrasiveCow {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(6);
        int k = 2;
        System.out.println(bookAllocation(arr, k));
    }

    private static int bookAllocation(ArrayList<Integer> arr, int k) {
        int start = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max,arr.get(i));
            min = Math.min(min,arr.get(i));
        }
        int end = max-min;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, k, mid)) {
                res = mid;
                start = mid + 1;
            } else end = mid - 1;
        }
        return res;
    }

    private static boolean isPossible(ArrayList<Integer> arr, int k, int mid) {

        int countStudent = 1;
        int pageSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (pageSum + arr.get(i) >= mid) {
                pageSum = pageSum + arr.get(i);
            } else {
                countStudent++;
                if (countStudent > k || arr.get(i) > mid) {
                    return false;
                }
                pageSum = arr.get(i);
            }
        }
        return true;
    }
}
