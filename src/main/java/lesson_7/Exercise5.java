package lesson_7;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        swapArray(array);
        printArray(array);
    }

    public static void swapArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
