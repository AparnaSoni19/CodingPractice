package geeksofgeek.palindrome;

public class PalindromeInteger {
    public static void main(String[] args) {

        int reminder,sum = 0,temp =0;
        int number =temp=454;
        while(number>0)
        {
            reminder =number%10;
            sum=(sum*10)+reminder;
            number=number/10;
        }
        if(temp==sum)
        {
            System.out.println("It is a Palindrome");
        }else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
