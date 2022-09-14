package palindrome;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        if(validPalindrome.isPalindrome("0P"))
        {
            System.out.printf("Palindrome");
        }else {
            System.out.printf("Not a palindrome");
        }
    }
    public boolean isPalindrome(String s) {
        s =s.replaceAll("[^a-zA-Z0-9]","");
        if(s == " ")
        {
            return true;
        }
        s =s.toLowerCase();
        char[] chars = s.toCharArray();
        for(int i=0,j=chars.length-1;j>i;i++,j--)
        {
            if(chars[i]!=chars[j])
            {
                return false;
            }
        }
        return true;

    }

}
