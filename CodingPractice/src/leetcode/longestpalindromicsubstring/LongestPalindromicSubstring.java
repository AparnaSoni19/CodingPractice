package leetcode.longestpalindromicsubstring;

import java.time.LocalDateTime;
import java.util.Timer;

public class LongestPalindromicSubstring {
   //getting time out
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LongestPalindromicSubstring LongestPalindromicSubstring = new LongestPalindromicSubstring();
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println("Longest Palindrome is" + LongestPalindromicSubstring.longestPalindrome(s));
        System.out.println(LocalDateTime.now());
    }

    public String longestPalindrome(String value) {
        int temp_Max = 0;
        int max = 0;
        String palidromeValue = "";
        for (int i = 0; i < value.length(); i++) {
            for (int j = value.length() - 1; j >= i; j--) {
                if (value.charAt(i) == value.charAt(j) && (checkForPalindrome(value.substring(i, j + 1)))) {
                    temp_Max = j - i + 1;
                    if (max < temp_Max) {
                        max = temp_Max;
                        palidromeValue = value.substring(i, j + 1);
                    }

                }
            }
        }
        return palidromeValue;
    }

    private static boolean checkForPalindrome(String substring) {
        for (int i = 0, j = substring.length() - 1; i < j; i++, j--) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
