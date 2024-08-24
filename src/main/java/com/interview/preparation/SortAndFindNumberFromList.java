package com.interview.preparation;

import java.util.*;
import java.util.stream.Collectors;

public class SortAndFindNumberFromList {


    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(89,3729,3289,3898,7878);

        int middleNumber = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get((numbers.size()-1)/2);

        System.out.println(middleNumber);
    }
}
