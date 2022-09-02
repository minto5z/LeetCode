import java.util.ArrayList;

public class PainterPartition {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        int k = 2;
        System.out.println(bookAllocation(arr, k));
    }

    private static int bookAllocation(ArrayList<Integer> arr, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.size(); i++) {
            end = end + arr.get(i);
        }
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, k, mid)) {
                res = mid;
                end = mid - 1;
            } else start = mid + 1;
        }
        return res;
    }

    private static boolean isPossible(ArrayList<Integer> arr, int k, int mid) {

        int countStudent = 1;
        int pageSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (pageSum + arr.get(i) <= mid) {
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
