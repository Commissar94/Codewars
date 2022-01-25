package kyu6;

public class ConvertStringToCamelCase {

    public static void main(String[] args) {
        toCamelCase("povar_vrach_milizioner");
        toCamelCase("the-stealth-warrior");
        toCamelCase("The_Stealth_Warrior");
    }

    static String toCamelCase(String s) {

        String delimiter1 = "-";
        String delimiter2 = "_";

        s = s.replaceAll(delimiter1, delimiter2);

        String[] words = s.split(delimiter2);
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]);

        for (int i = 1; i < words.length; i++) {
        sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
        }

        return sb.toString();
    }
}

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */