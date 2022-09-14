package array;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        int numberOfZeroesInArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) {
                numberOfZeroesInArray++;
            }
        }
        int[] arrNew = new int[arr.length+numberOfZeroesInArray];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            arrNew[j]=arr[i];
            if(arr[i]==0) {
                arrNew[j+1] =0;
                j++;
            }
            j++;
        }

        for(int i =0;i<arr.length;i++)
        {
            arr[i]=arrNew[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
