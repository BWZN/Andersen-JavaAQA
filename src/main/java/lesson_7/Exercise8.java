package lesson_7;

public class Exercise8 {
    public static void main(String[] args) {
        int n = 10;
        int[][] array = new int[n][n];
        fillDiagonal(array);
        printArray(array);
    }

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    public static void printArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
