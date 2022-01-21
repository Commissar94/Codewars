package kyu7;

public class StringEndsWith {

    public static void main(String[] args) {
        System.out.println(solution("abc", "abc"));
    }

    public static boolean solution(String str, String ending) {

        int indent = str.length() - ending.length(); //Отступ

        return indent >= 0 && str.substring(indent).equals(ending);
    }
}

/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
 */