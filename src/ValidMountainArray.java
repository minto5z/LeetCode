public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1,2};
        System.out.println(mountainArray(arr));
    }

    private static boolean mountainArray(int[] arr) {
        int n = arr.length;
        if (arr.length < 3) return false;
        int i=0;
        while (i<n-1&&arr[i]<arr[i+1])
            i++;
        if(i==0||i==n-1) return false;
        while (i<n-1&&arr[i]>arr[i+1])
            i++;
        if(i==n-1) return true;
        return false;
    }
}
