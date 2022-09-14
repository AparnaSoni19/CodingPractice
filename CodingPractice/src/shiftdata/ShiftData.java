package shiftdata;

public class ShiftData {
    public static void main(String[] args) {

        //"Welcome-349","Ygneqog-561"
        String value ="ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890123456789";
        String data = "WELCOME-349";
        String finalValue="";
        char[] dataChars = data.toCharArray();
        for(int i =0;i<data.length();i++)
        {
            int i1 = value.indexOf(dataChars[i]);
            if(i1<0)
            {
                finalValue +=dataChars[i];
            }else {
                finalValue += value.charAt(i1 + 2);
            }
        }
        System.out.println(finalValue);

    }
}
