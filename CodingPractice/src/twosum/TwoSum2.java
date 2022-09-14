package msoft.twosum;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target =9;
        TwoSum2 twoSum = new TwoSum2();
        System.out.printf(Arrays.toString(twoSum.twoSumm(nums,target)));
    }
    public int[] twoSumm(int[] nums, int target) {
        int length = nums.length;
        for(int i =0;i<length-1;i++)
        {
            for(int j =i+1;j<length;j++)
            {
                if(nums[j] == target- nums[i])
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0,0};
    }
}

