package geeksofgeek.reversestring;

public class ReverseWordsInString2 {
    public static void main(String[] args) {
        char[] charArray = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        ReverseWordsInString2 reverseWordsInString = new ReverseWordsInString2();
        int i = 0;
        int j = charArray.length - 1;
         reverseWordsInString.reverse(charArray, i, j);
        System.out.println(reverseWordsInString.reverseEachWord(charArray));
    }

    public void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
       // return s;
    }

    public char[] reverseEachWord(char[] s) {
        int i = 0;
        int k = s.length;
        int j = 0;
        while (i < k) {
            while (j < k && s[j] != ' ') {
                ++j;
            }
            reverse(s, i, j-1);
            i=j+1;
            j=j+1;

        }
      return s;
    }
}

