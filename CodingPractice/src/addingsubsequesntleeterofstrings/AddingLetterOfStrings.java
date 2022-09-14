package addingsubsequesntleeterofstrings;

public class AddingLetterOfStrings {
    public static void main(String[] args) {
        String[] arr = {"Daisy", "Rose", "Hyacinth", "Poppy"};
        String finalValue = "";
        int maxNumberOfLoop = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNumberOfLoop < arr[i].length() - 1) {
                maxNumberOfLoop = arr[i].length() - 1;
            }
        }
        for (int j = 0; j <= maxNumberOfLoop; j++) {
            for (int k = 0; k < arr.length; k++) {
                if(arr[k].length()-1>=j) {
                    finalValue += arr[k].charAt(j);
                }
            }
        }
        System.out.println(finalValue);
    }
}
