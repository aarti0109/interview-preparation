package com.interview.preparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestPaidEmployee {
    public static void main(String[] args){

        List<Employee> employees = Arrays.asList(
                new Employee("aarti", 10000.0),
                new Employee("priya", 20000.0),
                new Employee("praju", 30000.0)
        );

        employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getEmployeeName).ifPresent(System.out::println);
    }
}
