package kyu6;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add("XD");
        a.add(":0}");
        a.add("x:-");
        a.add("):-");
        a.add("D:");
        System.out.println(countSmileys(a));
    }

    public static int countSmileys(List<String> arr) {
        int smiles = 0;
        for (String str : arr) {
            boolean eyes = false, nose = false, mouth = false;

            char[] chars = str.toCharArray();
            if (chars[0] == ':' || chars[0] == ';') eyes = true;
            if (chars.length > 2 && (chars[1] == '-' || chars[1] == '~')) nose = true;
            if (chars.length == 3 && nose && (chars[2] == ')' || chars[2] == 'D')) mouth = true;
            if (chars.length == 2 && (chars[1] == ')' || chars[1] == 'D')) mouth = true;
            if (chars.length == 2 && eyes && mouth) smiles++;
            if (chars.length == 3 && eyes && nose && mouth) smiles++;
        }
        return smiles;
    }
}
/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same.
 */