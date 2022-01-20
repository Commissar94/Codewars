package kyu6;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("abca"));
        System.out.println(duplicateCount("abc"));
        System.out.println(duplicateCount("abca1g1"));
    }

    public static int duplicateCount(String text) {


        List<Character> list = text.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        return list.stream().filter(c -> Collections.frequency(list, c) > 1)
                .collect(Collectors.toSet())
                .size();
    }
}

/*
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */