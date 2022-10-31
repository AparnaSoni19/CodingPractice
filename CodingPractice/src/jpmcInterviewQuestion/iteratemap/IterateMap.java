import java.util.*;
import java.util.stream.Collectors;

public class MapC {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        // enter name/url pair
        map.put("GFG", "geeksforgeeks.org");
        map.put("Practice", "practice.geeksforgeeks.org");
        map.put("Code", "code.geeksforgeeks.org");
        map.put("Quiz", "quiz.geeksforgeeks.org");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        map.forEach((k,v)-> System.out.println(k+"Values"+v));

    }
}
