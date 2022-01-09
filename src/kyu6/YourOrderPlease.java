package kyu6;

/*
Your task is to sort a given string. Each word in the string will contain a single number.
This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */

public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order(""));
    }

    public static String order(String words) {

        if (words == "") {
            return "";
        }

        String[] inputWords = words.split(" ");
        StringBuilder sb = new StringBuilder();

        int counter = 1;

        while (counter < inputWords.length + 1) {
            for (String word : inputWords) {
                char ch = (char) (counter + '0');
                if (word.indexOf(ch) != -1) {
                    sb.append(word).append(" ");
                    counter++;
                    break;
                }
            }
        }

        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
