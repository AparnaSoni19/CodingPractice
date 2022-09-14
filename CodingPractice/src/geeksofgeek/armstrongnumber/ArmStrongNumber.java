package armstrongnumber;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n =153;
        ArmStrongNumber armStrongNumber = new ArmStrongNumber();
        boolean value =armStrongNumber.calculate(n);
        if(value)
        {
            System.out.println("It is armstrongNumber");
        }else {
            System.out.println("It is not a armstrongNumber");
        }
    }

    private boolean calculate(int n) {
        int originalNumber = n;
        int result =0;
        while(n>0)
        {
            int reminder = n%10;
            result+=Math.pow(reminder,3);
            n =n / 10;
        }
        if(originalNumber==result)
        {
            return true;
        }
         return false;

    }
}
