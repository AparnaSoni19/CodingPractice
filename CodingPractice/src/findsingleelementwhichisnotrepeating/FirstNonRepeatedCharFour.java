package findsingleelementwhichisnotrepeating;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharFour {
    public static void main(String[] args) {
        String value = "aparna";
        char[] chars = value.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch:chars)
        {
            map.put(ch,map.containsKey(ch)?map.get(ch)+1:1);
        }
        System.out.println(map.entrySet()
                .stream()
                .filter(x->x.getValue()==1).
                findFirst()
                .get()
                .getKey());
    }
}
