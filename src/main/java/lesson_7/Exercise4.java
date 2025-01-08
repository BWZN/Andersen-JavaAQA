package lesson_7;

public class Exercise4 {
    public static void main(String[] args) {
        printStringNTimes("Test", 5);
    }

    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
