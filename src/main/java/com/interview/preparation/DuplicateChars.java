package com.interview.preparation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args){

        String input = "Interview Preparation";

        // using core java
        char[] chars = input.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(char c: chars){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }

        // using stream API
//        Map<Character, Integer> charCount1 = input.replaceAll("\\s+", "")
//                .chars()
//                .mapToObj(c -> (char)c)
//                .collect(
//                        LinkedHashMap::new,
//                        (map, c) -> map.merge(c, 1, Integer::sum),
//                        LinkedHashMap.putAll)
//                .entrySet().stream()
//                .filter(e -> e.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
    }
}
