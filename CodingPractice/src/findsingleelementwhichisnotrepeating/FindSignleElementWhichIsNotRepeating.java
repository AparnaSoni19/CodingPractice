package findsingleelementwhichisnotrepeating;

import java.util.Arrays;

public class FindSignleElementWhichIsNotRepeating {
    public static void main(String[] args) {
        int[] arr = {2,4,2,6,8,6,8};//2,2,4,6,6,8,8
        Arrays.sort(arr);
        for(int i =0;i<arr.length-2; )
        {
            if(arr[i]== arr[i+1])
            {
                i=i+2;
            }else {
                System.out.println(arr[i]);
                i=i+1;
            }
        }
    }
}
