package com.interview.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareRootOfListElements {

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        List<Integer> sqrRoot = numbers.stream().map(val -> val * val).collect(Collectors.toList());

        System.out.println(sqrRoot);
    }
}
