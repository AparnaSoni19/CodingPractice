package arrayprogram;

class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,0,1};
        FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
        System.out.println(findMaxConsecutiveOnes.findMaxConsecutiveOnes(arr));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int tempMaxCount=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                tempMaxCount++;
            }else
            {
                if(maxCount<tempMaxCount)
                {
                    maxCount=tempMaxCount;
                    tempMaxCount =0;
                }
            }
        }
        if(maxCount<tempMaxCount)
                {
                    maxCount=tempMaxCount;
                    tempMaxCount =0;
                }
        return maxCount;
        
    }
}