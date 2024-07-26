package com.interview.preparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {

        // reverse list of strings
        List<String> input1 = new ArrayList<>();
        input1.add("Aarti");
        input1.add("Priya");
        input1.add("Praju");
        Collections.reverse(input1);
        System.out.println(input1);

        // reverse the word
        String input2 = "Aarti";
        String sb = new StringBuilder(input2).reverse().toString();
        System.out.println(sb);

        // reverse the word without using built-in functions
        String input3 = "Aarti";
        char[] charArray = input3.toCharArray();

        int len = charArray.length;
        for(int i=0; i<len/2; i++){
            char temp = charArray[i];
            charArray[i] = charArray[len-1-i];
            charArray[len-1-i] = temp;
        }
        System.out.println(charArray);
    }
}
