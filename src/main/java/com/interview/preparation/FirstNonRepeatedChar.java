package com.interview.preparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args){
        String input = "Java articles are Awesome";

        Optional<Character> nonRepeatedChar = input.replaceAll("\\s","").chars()
                .mapToObj(c->Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry-> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        nonRepeatedChar.ifPresent(System.out::println);
    }
}
