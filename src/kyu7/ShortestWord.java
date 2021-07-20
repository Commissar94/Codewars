package kyu7;

/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */
public class ShortestWord {

    public static int findShort(String s) {

        String[] input = s.split(" ");
        int min = input[0].length();

        for (int i = 0; i < input.length; i++) {
            if (input[i].length() < min) {
                min = input[i].length();
            }
        }

        return min;
    }
}
