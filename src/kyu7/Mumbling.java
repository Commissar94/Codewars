package kyu7;

public class Mumbling {

    //Как должно работать
    //accum("abcd") -> "A-Bb-Ccc-Dddd"
    //accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    //accum("cwAt") -> "C-Ww-Aaa-Tttt"
    public static String accum(String s) {

        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(j != 0 ? Character.toLowerCase(charArray[i]) : Character.toUpperCase(charArray[i]));
            }
            sb.append(i < charArray.length - 1 ? "-" : "");
        }
        return sb.toString();
    }
}
