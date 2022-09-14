package reversestring;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        String finalString = "";
        String[] stringArray=s.trim().split("\\s+");
        for(int j= stringArray.length-1;j>=0;j--)
        {
            finalString=finalString+stringArray[j]+" ";
        }
        System.out.println(finalString.trim());
    }
}
