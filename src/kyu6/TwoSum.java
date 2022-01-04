package kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3}, 4)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            output[0] = target - numbers[i];
            if (IntStream.of(numbers).anyMatch(x -> x == output[0])) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == output[0]) {
                        output[1] = j;
                        output[0] = i;
                        return output;
                    }
                }
            }
        }
        return null;
    }
}
