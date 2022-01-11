package kyu6;

public class DashatizeIt {
/*
Given a variable n,

If n is an integer, Return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.
If n is negative, then the negative sign should be removed.

If n is not an integer, return an empty value.
 */
    public static void main(String[] args) {
        System.out.println(dashatize(-1111111111));
    }

    public static String dashatize(int num) {

        if (num < 0) num = num * -1;
        StringBuilder sb = new StringBuilder();

        char[] digits = ("" + num).toCharArray();

        for (char digit : digits) {
            if (Character.getNumericValue(digit) % 2 == 1) sb.append("-").append(digit).append("-");
            else sb.append(digit);
        }

        if (sb.charAt(0) == '-') sb.deleteCharAt(0);
        if (sb.charAt(sb.length() - 1) == '-') sb.deleteCharAt(sb.length() - 1);
        for (int i = 2; i < sb.length() - 1; i++) {
            if (sb.charAt(i - 1) == '-' && sb.charAt(i) == '-') sb.deleteCharAt(i);
        }

        return sb.toString();
    }
}
/*
return String.valueOf(number)
        .replaceAll("([13579])", "-$1-")
        .replaceAll("--", "-")
        .replaceAll("^-|-$", "");
 */