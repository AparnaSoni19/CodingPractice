package array;

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
       int consecutiveOnes =0;
        int maxConsecutiveOnes=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                consecutiveOnes++;
            }
            else {
                if(maxConsecutiveOnes<consecutiveOnes)
                {
                    maxConsecutiveOnes=consecutiveOnes;
                }
                consecutiveOnes=0;
            }
        }
        if(maxConsecutiveOnes<consecutiveOnes)
        {
            maxConsecutiveOnes=consecutiveOnes;
        }
      return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int[] arr = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(arr));
    }
}

