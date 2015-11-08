import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.09.15.
 */

// Даны три целых числа. Найти количество
// положительных чисел в исходном наборе.

public class If004 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите число а : ");
        int a = s.nextInt();
        System.out.print("Введите число b : ");
        int b = s.nextInt();
        System.out.print("Введите число c : ");
        int c = s.nextInt();
        System.out.println();

        String numberA = null;
        String numberB = null;
        String numberC = null;

        String positiveNumber = "положительное.";
        String negativeNumber = "отрицательное.";

        if (a >= 0) {
            numberA = positiveNumber;
        } else numberA = negativeNumber;

        if (b >= 0) {
            numberB = positiveNumber;
        } else numberB = negativeNumber;

        if (c >= 0) {
            numberC = positiveNumber;
        } else numberC = negativeNumber;

        System.out.println("Введенное вами число a : " + numberA);
        System.out.println("Введенное вами число b : " + numberB);
        System.out.println("Введенное вами число c : " + numberC);
    }
}