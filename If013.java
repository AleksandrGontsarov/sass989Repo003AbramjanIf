import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 11.09.15.
 */

// Даны три числа. Найти среднее из них (то есть
// число, расположенное между наименьшим и наибольшим).

public class If013 {
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
        String MiddleA = "A";
        String MiddleB = "B";
        String MiddleC = "C";

        int result = 0; // дополнительная переменная

        if (a > b && a < c) {
            result = a;
            Result = MiddleA;
        } else if (b > a && b < c) {
            result = b;
            Result = MiddleB;
        } else if (c > a && c < b) {
            result = c;
            Result = MiddleC;
        }

        System.out.println("Среднне число " + Result + " = " + result + ".");
    }
}