package kyu6;

import java.util.Arrays;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 6, 8, -10, 3}));
        System.out.println(find(new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(find(new int[]{2, -6, 8, -10, -3}));
    }

    static int find(int[] integers) {

        boolean even = false;
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) counter++;
            if (counter == 2) even = true;
        }

        for (int num : integers) {
            if (num % 2 == 0 && !even) return num;
            if ((num % 2 == 1 || num % 2 == -1) && even) return num;
        }
        return 0;
    }
}
/*
You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.
 */