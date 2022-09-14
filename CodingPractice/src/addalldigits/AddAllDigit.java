package addalldigits;

public class AddAllDigit {
    public static void main(String[] args) {
        String val = "124";
        int number = Integer.parseInt(val);
        int sum =0;
        while(number >0)
        {
            sum=sum+number % 10;
            number = number/10;

        }
        System.out.println(sum);
    }
}
