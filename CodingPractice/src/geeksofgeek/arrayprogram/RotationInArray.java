package arrayprogram;

import java.util.Arrays;

public class RotationInArray {
    public static void main(String[] args) {
        int[] arr ={1,4,6,8,10};
        int rotationNumber = 5;
        RotationInArray rotationInArray = new RotationInArray();
        if(rotationNumber>arr.length-1)
        {
            throw new RuntimeException("Reduce the rotation");
        }
        rotationInArray.rotate(arr,rotationNumber);
    }

    private void rotate(int[] arr,int rotationNumber) {
        for(int j =0;j<rotationNumber;j++) {
            int temp = 0;
            temp = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] =temp;
        }
        System.out.println(Arrays.toString(arr) );
    }

}
