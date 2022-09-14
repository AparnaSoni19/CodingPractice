package primefactor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class PrimeFactor {
    public static void main(String[] args) {
        int number = 15;
        while(number%2==0)
        {
            System.out.println("2");
            number = number/2;
        }

        for(int i =3;i<=Math.sqrt(number);i+=2)
        {
            if(number%i==0)
            {
                System.out.println(i);
                number = number/i;
            }
        }
        if (number > 2)
            System.out.print(number);

    }
}
