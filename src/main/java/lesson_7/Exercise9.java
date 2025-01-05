package lesson_7;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        int len = 10;
        int initialValue = 1;
        int[] array = makeArray(len, initialValue);
        printArray(array);
    }

    public static int[] makeArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
