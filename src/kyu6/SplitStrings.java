package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
        System.out.println(Arrays.toString(solution("abcdef")));
    }

    public static String[] solution(String s) {

        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i = i + 2) {
            try {
                list.add("" + chars[i] + chars[i + 1]);
            } catch (Exception e) {
                list.add(chars[i] + "_");
            }
        }

        return list.toArray(new String[0]);
    }
}

/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 */