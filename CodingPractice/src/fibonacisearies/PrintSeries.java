package fibonacisearies;
//011235
public class PrintSeries {
    public static void main(String[] args) {
        int number = 1;
        int a =0;
        int b =1;
        int c;
        if(number>=0)
        {
            System.out.println(0);
        }
        if( number>=1)
        {
            System.out.println(1);
        }
        for(int i =2;i<=number;i++)
        {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
