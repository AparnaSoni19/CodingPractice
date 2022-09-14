package java8programpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> listNumber1 = Arrays.asList(1,2,3,4);
        List<Integer> listNumber2 = Arrays.asList(6,7,8,9);
        List<List<Integer>> listNumber3 = Arrays.asList(listNumber1,listNumber2);
        System.out.println(listNumber3.stream().
                flatMap(list->list.stream()).
                collect(Collectors.toList()));


    }
}
