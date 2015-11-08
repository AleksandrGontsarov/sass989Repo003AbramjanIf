import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 07.09.15.
 */

// Даны две переменные вещественного типа: A, B.
// Перераспределить значения данных переменных
// так, чтобы в A оказалось меньшее из значений,
// а в B — большее. Вывести новые значения переменных A и B.

public class If009 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите дробное число А : ");
        double a = s.nextDouble();
        System.out.print("Введите дробное число B : ");
        double b = s.nextDouble();
        System.out.println();

        double c; // дополнительная переменная

        if (a > b) {
            c = a;
            a = b;
            b = c;
        }

        System.out.println("Меньшее число А : " + a);
        System.out.println("Большее число B : " + b);
    }
}