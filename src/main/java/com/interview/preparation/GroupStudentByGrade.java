package com.interview.preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudentByGrade {

    public static void main(String[] args){

        List<Student> students = Arrays.asList(
                new Student(1, "aarti", "A"),
                new Student(1, "priya", "B"),
                new Student(1, "praju", "C"),
                new Student(1, "riya", "A"),
                new Student(1, "pooja", "C")
        );

        Map<String,List<Student>> studentsByGrade = students.stream().collect(Collectors.groupingBy(Student::getGrade));

        studentsByGrade.forEach((grade, studentList) -> {
            System.out.println("Grade :: "+grade);
            studentList.forEach(student -> System.out.println(" "+student.getName()));
        });
    }
}
