package reversestring;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] charArray={'h','e','l','l','o'};//oellh,olleh
        int j =0;
        int i = charArray.length-1;
        while(i>j)
        {
            char temp = charArray[j];
            charArray[j] =charArray[i];
            charArray[i]= temp;
            j++;
            i--;
        }
        System.out.printf(Arrays.toString(charArray));
    }
}
