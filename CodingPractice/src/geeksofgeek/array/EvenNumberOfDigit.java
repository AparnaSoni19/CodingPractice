package array;

public class EvenNumberOfDigit {
    public int findNumbers(int[] nums) {
        int evenNumberCount = 0;
        int digitAvailable;
        for(int i=0;i< nums.length ;i++)
        {
            digitAvailable = 0;
            int number = nums[i];
            while(number > 0)
            {
                digitAvailable++;
                if(number < 10) {
                    break;
                }
                    number = number / 10;


            }
            if(digitAvailable % 2==0)
            {
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }

    public static void main(String[] args) {
        int[] array = {12,345,2,6,7896};
        EvenNumberOfDigit evenNumberOfDigit = new EvenNumberOfDigit();
        System.out.println("Count is " + evenNumberOfDigit.findNumbers(array));
    }
}
