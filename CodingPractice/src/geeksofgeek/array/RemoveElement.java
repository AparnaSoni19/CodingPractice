package array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int numberOfTimesSwapping=0;
        int val = 2;
        int p = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if(i>=p || p<0){
                break;
            }
            while (arr[p] == val)
            {
                p--;
            }
            if (arr[i] == val) {
                int temp;
                temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                numberOfTimesSwapping++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}