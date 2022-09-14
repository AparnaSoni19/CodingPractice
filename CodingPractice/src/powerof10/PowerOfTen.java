package powerof10;

public class PowerOfTen {
    public static void main(String[] args) {
        int number =12;
        PowerOfTen powerOfTen = new PowerOfTen();
        boolean val = powerOfTen.checkForPowerOfTen(number);
        if(val == true)
        {
            System.out.println("It is Power Of Ten");
        }else {
            System.out.println("It is not a Power Of Ten");
        }
    }

    private  boolean checkForPowerOfTen(int number) {
        boolean val = false;
        while(number >=10)
        {
            if(number %10==0)
            {
                val = true;
            }else {
                return val;
            }
            number = number /10;
        }
        return  val;
    }
}
