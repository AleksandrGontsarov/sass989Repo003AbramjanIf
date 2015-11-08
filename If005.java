import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.09.15.
 */

// Даны три целых числа. Найти количество положительных
// и количество отрицательных чисел в исходном наборе.

public class If005 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите число а : ");
        int a = s.nextInt();
        System.out.print("Введите число b : ");
        int b = s.nextInt();
        System.out.print("Введите число c : ");
        int c = s.nextInt();
        System.out.println();

        int numbers[] = {a, b, c};

        int counterPositive = 0;
        int counterNegative = 0;

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

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                counterPositive = counterPositive + 1;
            } else counterNegative = counterNegative + 1;
        }

        System.out.println("Введенное вами число a : " + numberA);
        System.out.println("Введенное вами число b : " + numberB);
        System.out.println("Введенное вами число c : " + numberC);
        System.out.println();
        System.out.println("Количество положительных чисел = " + counterPositive);
        System.out.println("Количество отрицательных чисел = " + counterNegative);
    }
}