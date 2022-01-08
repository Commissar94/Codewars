package kyu6;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {

        String number = String.valueOf(n);

        char[] digits = number.toCharArray();
        int counter = 0;
        if (digits.length > 1) {
            do {
                n=1;
                for (char digit : digits) {
                    n = Character.getNumericValue(digit) * n;
                }
                digits = String.valueOf(n).toCharArray();
                counter++;
            } while (n >= 9);
        }
        return counter;
    }
}


/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example (Input --> Output):

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
 */