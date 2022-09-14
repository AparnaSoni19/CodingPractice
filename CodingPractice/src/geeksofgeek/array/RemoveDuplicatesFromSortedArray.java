package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int j = 0;
        int insertPlace = 1;
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        for (int i = 0; i < arr.length && j < arr.length - 1; i++) {
            j++;
            if (arr[i] != arr[j]) {
                arr[insertPlace] = arr[j];
                insertPlace++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
