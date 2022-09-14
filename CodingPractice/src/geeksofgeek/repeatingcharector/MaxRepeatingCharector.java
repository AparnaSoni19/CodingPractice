package repeatingcharector;

public class MaxRepeatingCharector {
    public static void main(String[] args) {
        String value = "Learn Javan";
        int count =1;
       char maxChar='\u0000';
        int maxCount =1;
        String afterReplacingSpace = value.replaceAll("\\s","");
        char[] chars = afterReplacingSpace.toCharArray();
        for(int i =0;i<value.length()-1;i++)
        {
            for(int j =i+1;j<value.length()-1;j++)
            {
                if(chars[i] == chars[j])
                {
                    count++;
                }
            }
            if(maxCount<count)
            {
                maxCount = count;
                count =1;
                maxChar =chars[i];
            }else {
                count =1;
            }
        }
        System.out.println(maxCount+" "+maxChar);
    }
}
