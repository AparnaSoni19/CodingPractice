package palindrome;

public class StringPalandrome {
    public static void main(String[] args) {
        StringPalandrome stringPalandrome = new StringPalandrome();
        if(stringPalandrome.isPalindrome())
        {
            System.out.println("is Palindrome");
        }else
        {
            System.out.println("Not a Palindrome");
        }

    }

    private boolean isPalindrome() {
        String val ="ABBA";
        int i=0;
        boolean isPalindrome=false;
        int j =val.length();
        while(i<j)
        {
            if(val.indexOf(i)==val.indexOf(j))
            {
                isPalindrome=true;
            }else {
                return isPalindrome=false;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}
