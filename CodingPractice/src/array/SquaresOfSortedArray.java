package array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squareArray = new int[nums.length];
        int[] sortedSquareArray = new int[nums.length];
        for(int i =0; i< nums.length; i++)
        {
            squareArray[i]= nums[i] * nums[i];
        }
        Arrays.sort(squareArray);
        return squareArray;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresOfSortedArray.sortedSquares(arr)));
    }
}
