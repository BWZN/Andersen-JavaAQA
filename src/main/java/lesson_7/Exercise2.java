package lesson_7;

public class Exercise2 {
    public static void main(String[] args) {
        checkNum(-1);
        checkNum(0);
        checkNum(1);
    }

    public static void checkNum(int n) {
        if (n >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
