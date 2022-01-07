package kyu6;

public class FindTheOddInt {
    public static void main(String[] args) {

        int[] test = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(test));

    }

    public static int findIt(int[] a) {
        for (int number : a) {
            int counter = 0;
            for (int num : a) {
                if (number == num) {
                    counter++;
                }
            }
            if (counter % 2 == 1) {
                return number;
            }
        }
        return 0;
    }
}
