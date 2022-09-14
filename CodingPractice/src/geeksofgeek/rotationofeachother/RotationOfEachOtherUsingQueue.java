package rotationofeachother;

import java.util.LinkedList;
import java.util.Queue;

public class RotationOfEachOtherUsingQueue {
    public static void main(String[] args) {
        String val = "ABCD";
        String val2 = "CDAB";
        RotationOfEachOtherUsingQueue rotationOfEachOtherUsingQueue = new RotationOfEachOtherUsingQueue();
       if( rotationOfEachOtherUsingQueue.isRotationOfEachOther(val, val2))
       {
           System.out.println("Rotation of each other");
       }else {
           System.out.println("Not a Rotation of each other");
       }
    }
        public boolean isRotationOfEachOther(String val,String val2)
        {
        if(val.length()==val2.length() )
        ;
            Queue<Character> queue1 = new LinkedList<>();
            for(int i =0;i<val.length();i++)
            {
                queue1.add(val.charAt(i));
        }

            Queue<Character> queue2 = new LinkedList<>();
            for(int i =0;i<val2.length();i++)
            {
                queue2.add(val2.charAt(i));
            }
            int length = val2.length();
            while(length>0)
            {
                length--;
                char ch = queue2.peek();
                queue2.remove();
                queue2.add(ch);
                if(queue1.equals(queue2))
                {
                    return true;
                }
            }
            return  false;


    }




}
