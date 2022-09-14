package secondhighestsalary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestSalary {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"AAA",12000);
        Employee emp2 = new Employee(1,"AAA",4000);
        Employee emp3 = new Employee(1,"AAA",10000);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list.stream().
                sorted(Comparator.comparing(employee -> employee.salary))
                .skip(1).findFirst());
    }

}
