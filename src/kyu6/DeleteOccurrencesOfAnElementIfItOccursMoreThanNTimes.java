package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes {
    public static void main(String[] args) {

        int[] input1 = new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3};
        int[] input2 = new int[]{20,37,20,21};
        int[] input3 = new int[]{1,1,3,3,7,2,2,2,2};

        System.out.println(Arrays.toString(deleteNth(input1, 2)));
        System.out.println(Arrays.toString(deleteNth(input2, 1)));
        System.out.println(Arrays.toString(deleteNth(input3, 3)));

    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        List<Integer> list = new ArrayList<>();
        for (int num : elements) {
            list.add(num);
        }

        List<Integer> outputList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int seen = 0;
            for (int j = 0; j < i; j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                    seen++;
                }
            }
            if (seen < maxOccurrences) {
                outputList.add(list.get(i));
            }
        }

        return outputList.stream().mapToInt(i -> i).toArray();
    }
}

/*
Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering.
For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2],
drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 */