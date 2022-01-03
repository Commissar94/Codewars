package kyu6;
/*
Complete the solution so that the function will break up camel casing, using a space between words.
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
 */
public class BreakCamelCase {

    public static void main(String[] args) {
        System.out.println(breakCamel("camelCase"));
    }


    public static String breakCamel(String input) {

        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                sb.append(" ").append(chars[i]);
            } else {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}
