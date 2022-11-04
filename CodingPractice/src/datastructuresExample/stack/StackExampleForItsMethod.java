package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackExampleForItsMethod {
    static int  arrPosition = 0;
    public static void main(String[] args) {
       int[] arr = new int[5];
       int element =5;
        StackExampleForItsMethod stackExampleForItsMethod = new StackExampleForItsMethod();
       //push() implementation
        stackExampleForItsMethod.pushElement(arr,element);
        stackExampleForItsMethod.pushElement(arr,6);
        System.out.println(Arrays.toString(arr));

        //pop Element
        stackExampleForItsMethod.popElement(arr);
    }

    private void pushElement(int[] arr,int element) {
        arr[arrPosition] = element;
        arrPosition++;
    }

    private void popElement(int[] arr) {
        int val =arr[arrPosition-1];
        System.out.println("Poping element"+val);
        arr[arrPosition] =0;
        if(arrPosition>0)
        arrPosition--;
    }
}
