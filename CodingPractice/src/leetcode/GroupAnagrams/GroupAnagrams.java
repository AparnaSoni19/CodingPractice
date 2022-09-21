package leetcode.GroupAnagrams;

import java.sql.Time;
import java.time.LocalTime;
import java.util.*;
//getting time out
public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> inputStringList = new LinkedList<String>(Arrays.asList(strs));
        List<List<String>> finalList = new ArrayList<>();
        GroupAnagrams anagrams = new GroupAnagrams();
        System.out.println("Value is" + groupAnagrams(inputStringList, finalList, anagrams));
        System.out.println(LocalTime.now());
    }

    private static List<List<String>> groupAnagrams(List<String> inputStringList, List<List<String>> finalList, GroupAnagrams anagrams) {
        Map<Character, Integer> initialMap = anagrams.putInInitialMap(inputStringList.get(0));
        List<String> addStringList = new ArrayList<>();
        for (Iterator<String> i = inputStringList.iterator(); i.hasNext(); ) {
            String val = i.next();
            Map<Character, Integer> newMap = anagrams.putInInitialMap(val);
            if (initialMap.size() == newMap.size() && initialMap.equals(newMap)) {
                i.remove();
                addStringList.add(val);
            }
        }
        finalList.add(addStringList);
        if (inputStringList.size() > 0) {

            groupAnagrams(inputStringList, finalList, anagrams);
        }
        return finalList;
    }

    public Map putInInitialMap(String strs) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length(); i++) {
            map.put(strs.charAt(i), map.containsKey(strs.charAt(i)) ? map.get(strs.charAt(i)) + 1 : 1);
        }
        return map;
    }
}

