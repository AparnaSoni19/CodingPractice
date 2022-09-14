package factorial;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        int n =5;
        FactorialWithRecursion factorial =new FactorialWithRecursion();
        System.out.println(factorial.calculateFactorial(n));
    }

    public int calculateFactorial(int val)
    {
        if (val==0 || val==1)
        {
            return 1;
        }
        return val*calculateFactorial(val-1);
    }
}
