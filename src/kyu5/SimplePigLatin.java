package kyu5;

import java.util.regex.Pattern;

/*
Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 */
public class SimplePigLatin {

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            StringBuilder newWord = new StringBuilder();
            char[] chars = word.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                newWord.append(chars[i]);
            }
            newWord.append(chars[0]);
            if (!Pattern.matches("\\p{Punct}", newWord.toString())) {
                newWord.append("ay");
            }
            output.append(newWord).append(" ");
        }
        return output.deleteCharAt(output.length() - 1).toString();
    }
}
