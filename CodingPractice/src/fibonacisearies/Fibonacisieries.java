package fibonacisearies;

public class Fibonacisieries {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(fib(n));

    }
    public static int fib(int n)
    {
        int a=0;
        int b =1;
        int c ;
        if(n==0)
        {
            return a;
        }
        for(int i =2;i<=n;i++)
        {
            c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
