package array;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 4, 2, 1};
        System.out.println( extracted(arr));
    }

    private static boolean extracted(int[] arr) {
        int length = arr.length;
        int i = 0;
        while (i < length && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 && i == length - 1) {
            return false;
        }
        while (i+1 < length && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == length - 1;
    }
}
