package primenumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int number =5;
        PrimeNumber primeNumber = new PrimeNumber();
         boolean val =primeNumber.calculatePrime(number);
         if(val)
         {
             System.out.println("It is prime");
         }else {
             System.out.println("It is Not a prime");
         }
    }

    private  boolean calculatePrime(int number) {
        if(number <=1 )
        {
            return false;
        }
        if(number==2||number==3)
        {
            return true;
        }
        if(number%2 ==0||number%3==0)
        {
            return false;
        }
        for(int i =3;i<=Math.sqrt(number);i+=2)
        {
            if(number % i == 0)
            {
                return  false;
            }
        }
        return true;
    }

}
