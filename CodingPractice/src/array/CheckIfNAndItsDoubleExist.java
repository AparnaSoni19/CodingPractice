package array;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};//{1,7,11,14}
        int j = 0;
        boolean ifNAndItsDoubleExist = false;
        Arrays.sort(arr);
        int middleElement = arr[arr.length / 2];
        for (int i = 0; i < arr.length - 1; i++) {
            if (middleElement >= arr[i] * 2) {
                ifNAndItsDoubleExist = checkInLeft(arr[i], arr, ifNAndItsDoubleExist);
            } else {
                ifNAndItsDoubleExist = checkInRight(arr[i], arr, ifNAndItsDoubleExist);
            }
            if(true==ifNAndItsDoubleExist)
            {
                break;
            }
        }
        System.out.println(ifNAndItsDoubleExist);
    }

    private static boolean checkInRight(int val, int[] arr, boolean ifNAndItsDoubleExist) {
        for (int i = arr.length / 2; i < arr.length; i++) {
            if (val * 2 == arr[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkInLeft(int val, int[] arr, boolean ifNAndItsDoubleExist){
            for (int i = arr.length / 2; i >= 0; i--) {
                if (val * 2 == arr[i]) {
                    return true;
                }
            }
        return false;
        }
    }

