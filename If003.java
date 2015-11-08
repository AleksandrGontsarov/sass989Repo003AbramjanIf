import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.09.15.
 */

// Дано целое число. Если оно является положительным,
// то прибавить к нему 1; если отрицательным, то
// вычесть из него 2; если нулевым, то заменить его на 10.
// Вывести полученное число.

public class If003 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Введите целое число a : ");
        int a = s.nextInt();
        System.out.println();
        int result;

        String number = null;
        String number2 = null;
        String number3 = null;
        String positiveNumber = "положительное.";
        String negativeNumber = "отрицательное.";
        String zeroNumber = "равно нулю.";
        String positiveNumber2 = "прибавляем к нему 1.";
        String negativeNumber2 = "вычетаем из него 2.";
        String zeroNumber2 = "заменяем его на 10.";

        if (a > 0) {
            result = a + 1;
        } else if (a == 0) {
            result = 10;
        } else result = a - 2;

        if (a > 0) {
            number = positiveNumber;
        } else if (a == 0) {
            number = zeroNumber;
        } else number = negativeNumber;

        if (a > 0) {
            number2 = positiveNumber2;
        } else if (a == 0) {
            number2 = zeroNumber2;
        } else number2 = negativeNumber2;

        System.out.println("Если число является положительным, то прибавляем к нему 1.");
        System.out.println("Если отрицательным, то вычетаем из него 2.");
        System.out.println("Если число равно нулю, то заменяем его на 10.");
        System.out.println();
        System.out.println("Введенное вами число : " + number);
        System.out.println("Поэтому мы " + number2);
        System.out.println();
        System.out.println("Выводим полученное число : " + result);
    }
}