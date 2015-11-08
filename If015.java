import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 24.09.15.
 */

// Даны три числа. Найти сумму двух наибольших из них.

public class If015 {
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

        String ResultMiddle = null;
        String MiddleA = "A";
        String MiddleB = "B";
        String MiddleC = "C";
        int resultMiddle = 0;

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

        if (a > b && a < c) {
            resultMiddle = a;
            ResultMiddle = MiddleA;
        } else if (b > a && b < c) {
            resultMiddle = b;
            ResultMiddle = MiddleB;
        } else if (c > a && c < b) {
            resultMiddle = c;
            ResultMiddle = MiddleC;
        }

        int sum;
        sum = resultBigger + resultMiddle;

        System.out.println("Наибольшее число : " + ResultBigger + " = " + resultBigger + ".");
        System.out.println();
        System.out.println("Среднее число : " + ResultMiddle + " = " + resultMiddle + ".");
        System.out.println();
        System.out.println("Сумма этих чисел : " + resultBigger + " + " + resultMiddle + " = " + sum + ".");
    }
}