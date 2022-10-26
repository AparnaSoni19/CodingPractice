package geeksofgeek.java8programpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,8,10));
        for(int k =0,j=list.size()-1;k<j;k++)
        {
            list.add(k,list.remove(j));
        }
        System.out.println(list);
    }
}
