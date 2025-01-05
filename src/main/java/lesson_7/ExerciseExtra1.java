package lesson_7;

public class ExerciseExtra1 {
    public static void main(String[] args) {
        System.out.println(leapYearCheck(2008));
        System.out.println(leapYearCheck(2056));
        System.out.println(leapYearCheck(1900));
        System.out.println(leapYearCheck(2010));
    }

    public static boolean leapYearCheck(int year) {
        if (year % 400 == 0) {
            return true;
        } else
            if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

}
