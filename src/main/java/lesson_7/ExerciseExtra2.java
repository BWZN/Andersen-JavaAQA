package lesson_7;

public class ExerciseExtra2 {
    public static void shiftArray(int[] arr, int n) {
        int len = arr.length;

        n = n % len;
        if (n < 0) {
            n += len;
        }

        for (int i = 0, j = len - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);
        for (int i = n, j = len - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        printArray(array1);
        shiftArray(array1, 1);

        int[] array2 = {3, 5, 6, 1};
        printArray(array2);
        shiftArray(array2, -2);
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
