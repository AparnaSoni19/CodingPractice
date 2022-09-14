package array;

public class EmptyIndexInArray {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        int maxNumberofOne = 0;
        for(int i =0;i<=array.length-1;i++)
        {
            if(array[i]==1)
            {
                maxNumberofOne++;
            }
        }
        System.out.println(maxNumberofOne);

    }
}
