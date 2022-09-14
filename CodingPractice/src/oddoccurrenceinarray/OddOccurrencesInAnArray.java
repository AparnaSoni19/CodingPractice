package oddoccurrenceinarray;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OddOccurrencesInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i=0;i<arr.length;i++) {
            map.put(arr[i], map.containsKey(arr[i]) ?  map.get(arr[i]) + 1 :  1);
        }
        System.out.println(map.entrySet().stream().filter(i->i.getValue()%2>0).findFirst().get().getKey());
    }
}
