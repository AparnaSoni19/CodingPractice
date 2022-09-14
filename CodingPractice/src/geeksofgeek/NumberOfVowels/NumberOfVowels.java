package NumberOfVowels;

public class NumberOfVowels {
    public static void main(String[] args) {
        String name ="Aparna";
        char[] chars = name.toCharArray();
        int count =0;
        for(int i =0;i<name.length();i++)
        {
            if(isVowel(chars[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch)
    {
        if(ch=='A'|| ch =='E' || ch =='I' ||  ch =='O' || ch =='U'
        || ch=='a'|| ch =='e' || ch =='i' ||  ch =='o' || ch =='u') {
            return true;
        }
        return false;
    }
}
