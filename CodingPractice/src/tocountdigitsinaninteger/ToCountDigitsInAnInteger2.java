package tocountdigitsinaninteger;

import tocountdigitsinaninteger.exception.NumberException;

public class ToCountDigitsInAnInteger2 {
    public static void main(String[] args) {
        String number ="575675";
        try {
            int val = Integer.parseInt(number);
            System.out.println(number.length());
        }catch (NumberException ex)
        {
            new NumberException("Not a Number");
        }

    }
}
