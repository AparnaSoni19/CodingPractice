package arrayprogram;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        LeadersInAnArray LeadersInAnArray = new LeadersInAnArray();
        LeadersInAnArray.findLeaders(arr);
    }

    private void findLeaders(int[] arr) {
        int length = arr.length;
        boolean leader = false;
        int max_from_right =  arr[length-1];
        System.out.println("Leader is "+max_from_right);
        for(int i =length-2;i>=0;i--)
        {
            if(max_from_right<arr[i])
            {
                max_from_right=arr[i];
                System.out.println("Leader is "+max_from_right);
            }
        }
    }
}
