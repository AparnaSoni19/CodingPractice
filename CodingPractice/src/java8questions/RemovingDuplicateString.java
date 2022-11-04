package stringquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemovingDuplicateString {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        //fruits.add("orange");
        fruits.add("apple");
        Map<String,Integer> fruitMap = new HashMap<>();
        List<String> duplicateElemnt = new ArrayList<>()
;        for(String fruit:fruits) {
             fruitMap.put(fruit,fruitMap.containsKey(fruit)?fruitMap.get(fruit)+1:1);
        }
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            if(entry.getValue()>1)
            {
                duplicateElemnt.add(entry.getKey());
            }

        }
        System.out.println(duplicateElemnt.toString());

    }
}
