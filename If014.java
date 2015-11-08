import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 12.09.15.
 */

// Даны три числа. Вывести вначале наименьшее,
// а затем наибольшее из данных чисел.

public class If014 {
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

        String ResultBigger = null;
        String BiggerA = "A";
        String BiggerB = "B";
        String BiggerC = "C";
        int resultBigger = 0; // дополнительная переменная

        String ResultSmaller = null;
        String SmallerA = "A";
        String SmallerB = "B";
        String SmallerC = "C";
        int resultSmaller = 0;

        if (a > b && a > c) {
            resultBigger = a;
            ResultBigger = BiggerA;
        } else if (b > a && b > c) {
            resultBigger = b;
            ResultBigger = BiggerB;
        } else if (c > a && c > b) {
            resultBigger = c;
            ResultBigger = BiggerC;
        }

        if (a < b && a < c) {
            resultSmaller = a;
            ResultSmaller = SmallerA;
        } else if (b < a && b < c) {
            resultSmaller = b;
            ResultSmaller = SmallerB;
        } else if (c < a && c < b) {
            resultSmaller = c;
            ResultSmaller = SmallerC;
        }

        System.out.println("Наименьшее число : " + ResultSmaller + " = " + resultSmaller + ".");
        System.out.println();
        System.out.println("Наибольшее число : " + ResultBigger + " = " + resultBigger + ".");
    }
}