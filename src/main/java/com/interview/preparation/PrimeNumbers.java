package com.interview.preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {

        // using stream API
        List<Integer> primeNumbers1 = IntStream.range(1, 100)
                .filter(number -> number > 1
                        && IntStream.range(2, number)
                        .noneMatch(divider -> number % divider == 0))
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Prime numbers :: " + primeNumbers1);

        // using core java

        List<Integer> primeNumbers2 = new ArrayList<>();
        for(int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                primeNumbers2.add(i);
        }
        System.out.println("Prime numbers :: " + primeNumbers2);
    }
}
