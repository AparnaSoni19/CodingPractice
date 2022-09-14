package msoft.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumBestApproach {
    //Time: O(n)
    //Space:O(n)
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum2 twoSum = new TwoSum2();
        System.out.printf(Arrays.toString(twoSum.twoSumm(nums, target)));
    }

    public int[] twoSumm(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
