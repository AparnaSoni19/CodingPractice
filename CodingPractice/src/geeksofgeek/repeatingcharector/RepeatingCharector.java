package repeatingcharector;

public class RepeatingCharector {
    public static void main(String[] args) {
        String value = "aparna";
        char[] chars = value.toCharArray();
        for(int i =0;i<value.length();i++)
        {
            if(value.indexOf(chars[i])!=value.lastIndexOf(chars[i]))
            {
                System.out.println(chars[i]);
            }
        }

    }
}
