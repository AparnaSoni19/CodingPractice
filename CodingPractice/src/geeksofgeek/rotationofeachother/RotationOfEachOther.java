package rotationofeachother;

public class RotationOfEachOther {
    public static void main(String[] args) {
        String val ="ABACD";
        String val2 ="CDABA";
        if(val.length()==val2.length() && val.concat(val).contains(val2))
        {
            System.out.println("It is rotation");
        }else {
            System.out.println("It is not a rotation");
        }

    }




}
