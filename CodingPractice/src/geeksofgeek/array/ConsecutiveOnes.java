package array;

public class ConsecutiveOnes {
        public static void main(String[] args) {
            int[] array = {1,1,0,1,1,1};
            int temp = array[0];
            int maxNumberofOne = 0;
            for(int i =1;i<=array.length-1;i++)
            {
                if(temp ==array[i] && temp ==1)
                {

                    maxNumberofOne++;

                }
                temp=array[i];
            }
            System.out.println(maxNumberofOne);

        }
    }


