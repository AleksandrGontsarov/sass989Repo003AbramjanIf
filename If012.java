import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.09.15.
 */

// Даны три числа. Найти наименьшее из них.

public class If012 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число A : ");
        int a = s.nextInt();
        System.out.print("Введите число B : ");
        int b = s.nextInt();
        System.out.print("Введите число C : ");
        int c = s.nextInt();
        System.out.println();

        String Result = null;
        String SmallerA = "A";
        String SmallerB = "B";
        String SmallerC = "C";

        int result = 0; // длполнительная переменная

        if (a < b && a < c) {
            result = a;
            Result = SmallerA;
        } else if (b < a && b < c) {
            result = b;
            Result = SmallerB;
        } else if (c < a && c < b) {
            result = c;
            Result = SmallerC;
        }

        System.out.println("Наименьшее число " + Result + " = " + result + ".");
    }
}