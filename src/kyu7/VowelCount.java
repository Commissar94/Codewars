package kyu7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class VowelCount {
    /*
    Return the number (count) of vowels in the given string.

    We will consider a, e, i, o, u as vowels for this Kata (but not y).

    The input string will only consist of lower case letters and/or spaces.
     */

    public static void main(String[] args) {

    }


    public static int getCount(String str) {
        int vowelsCount = 0;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] chars = str.toLowerCase(Locale.ROOT).toCharArray();
        for (Character ch : chars) {
            if (vowels.contains(ch)) vowelsCount++;
        }
        return vowelsCount;
    }
}
