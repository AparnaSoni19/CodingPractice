package arrayprogram;

import java.util.Arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
         if(isSorted(arr))
         {
             System.out.println("Sorted");
         }else {
             System.out.println("Not Sorted");
         }
    }

    private static boolean isSorted(int[] arr) {
        for(int i = 0; i< arr.length-2; i++)
        {
            if(arr[i]> arr[i+1])
            {
                return false;
            }
        }
        return  true;
    }
}
