package java8programpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> filteredList = list.stream().filter(n->n>2).collect(Collectors.toList());
        System.out.println(filteredList);
        Collections.reverse(list);
        System.out.println(list);
    }
}
