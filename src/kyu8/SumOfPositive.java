package kyu8;

public class SumOfPositive {
    //сумма позитивных чисел
    int sum(int[] arr) {
        int result = 0;

        for (int num : arr
        ) {
            if (num > 0) {
                result = result + num;
            }
        }
        return result;
    }
}
