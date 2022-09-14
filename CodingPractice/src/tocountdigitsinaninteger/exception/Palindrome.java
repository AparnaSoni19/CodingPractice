package tocountdigitsinaninteger.exception;

public class Palindrome {
    public static void main(String[] args) {
        String value = "1451";
        boolean val = false;
        char[] chars = value.toCharArray();
        for(int i =0;i<chars.length/2;i++)
        {
            if(chars[i]==chars[chars.length-1-i])
            {
                val =true;
            }else
            {
                val =false;
                System.out.println("It is not a Palindrome");
                break;
            }
        }
        if(val)
        {
            System.out.println("It is Palindrome");
        }

        }
    }

