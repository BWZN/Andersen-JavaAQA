package lesson_7;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(sumIn10and20(5, 1));
        System.out.println(sumIn10and20(5, 10));
        System.out.println(sumIn10and20(5, 5));
        System.out.println(sumIn10and20(5, 15));
        System.out.println(sumIn10and20(15, 10));
    }

    public static boolean sumIn10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


}
