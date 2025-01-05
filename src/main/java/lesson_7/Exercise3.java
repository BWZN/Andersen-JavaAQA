package lesson_7;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(checkNumBool(-1));
        System.out.println(checkNumBool(0));
        System.out.println(checkNumBool(1));
    }

    public static boolean checkNumBool(int number) {
        return number < 0;
    }
}
