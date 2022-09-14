package factorial;

public class Factorial {
    public static void main(String[] args) {
        int n =5;
        Factorial fact = new Factorial();
        System.out.println(fact.calculateFactorial(n));
    }

    private int calculateFactorial(int n) {
        int val =1;
        for(int i =2 ;i<=n;i++)
        {
              val*=i;
        }
        return val;
    }
}
