package lesson_7;

public class Exercise6 {
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
