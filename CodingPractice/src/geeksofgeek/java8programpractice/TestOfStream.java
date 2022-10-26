package geeksofgeek.java8programpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TestOfStream {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"TestName",10000);
        Employee emp2 = new Employee(2,"TestName",20000);
        Employee emp3 = new Employee(3,"TestName",30000);
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(emp,emp2,emp3));
        IntSummaryStatistics collect = employeeList.stream().collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println(collect.getAverage());

    }
}
