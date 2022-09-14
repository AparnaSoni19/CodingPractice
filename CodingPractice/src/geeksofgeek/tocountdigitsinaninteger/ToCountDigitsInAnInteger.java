package tocountdigitsinaninteger;

public class ToCountDigitsInAnInteger {
    public static void main(String[] args) {
       int  number = 125676867;
       int count=0;
       while(number != 0)
       {
           number= number/10;
           count++;
       }
        System.out.println(count);

    }
}