import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.09.15.
 */

// Дано целое число. Если оно является положительным,
// то прибавить к нему 1; в противном случае не
// изменять его. Вывести полученное число.

public class If001 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число a : ");
        int a = s.nextInt();
        System.out.println();
        int result;

        String number = null;
        String number2 = null;
        String positiveNumber = "положительное.";
        String negativeNumber = "отрицательное.";
        String positiveNumber2 = "прибавляем к нему 1.";
        String negativeNumber2 = "не изменяем его.";

        if (a >= 0) {
            result = a + 1;
        } else result = a;

        if (a >= 0) {
            number = positiveNumber;
        } else number = negativeNumber;

        if (a >= 0) {
            number2 = positiveNumber2;
        } else number2 = negativeNumber2;

        System.out.println("Если число является положительным, то прибавляем к нему 1, в противном случае не изменяем его.");
        System.out.println();
        System.out.println("Введенное вами число : " + number);
        System.out.println("Поэтому мы " + number2);
        System.out.println();
        System.out.println("Выводим полученное число : " + result);
    }
}