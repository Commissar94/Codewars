package kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 5, 4, 3, 2, 1};
        sortArray(array);
    }

    public static int[] sortArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 1) list.add(num);
        }
        list = list.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < array.length; i++) {
            if (list.isEmpty()) break;
            if (array[i] % 2 == 1) {
                array[i] = list.get(0);
                list.remove(0);
            }
        }
        return array;

    }
}

/*
Task
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

Examples
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */

/*
Фильтр и сортировку можно было сделать стримами
    final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
 */