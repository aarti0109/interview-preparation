package com.interview.preparation;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args){
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(1);
        elements.add(3);
        elements.add(2);

        // using stream API
        List<Integer> uniqueElements1 = elements.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueElements1);

        // convert ArrayList into HashSet
        Set<Integer> uniqueElements2 = new HashSet<>(elements);
        System.out.println(uniqueElements2);

        // without using built-in functions
        List<Integer> uniqueElements3 = new ArrayList<>();
        for (Integer element : elements) {
            if (!uniqueElements3.contains(element)) {
                uniqueElements3.add(element);
            }
        }
        System.out.println(uniqueElements3);
    }
}
