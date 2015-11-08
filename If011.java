import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 08.09.15.
 */

// Даны две переменные целого типа: A и B. Если их значения
// не равны, то присвоить каждой переменной большее из этих
// значений, а если равны, то присвоить переменным нулевые
// значения. Вывести новые значения переменных A и B.

public class If011 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите целое число А : ");
        int a = s.nextInt();
        System.out.print("Введите целое число B : ");
        int b = s.nextInt();
        System.out.println();

        int c = 0; // дополнительная переменная
        String Result = null;
        String Equals = "Переменные равны и мы присваиваем каждой нулевые значения.";
        String Inequality = "Переменные не равны и мы присваиваем каждой большее из этих значений.";

        if (a > b) {
            c = a;
        } else c = b;

        if (a != b) {
            a = c;
            b = c;
            Result = Inequality;
        } else if (a == b) {
            a = 0;
            b = 0;
            Result = Equals;
        }

        System.out.println(Result);
        System.out.println();
        System.out.println("Выводим новые значения переменных :");
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }
}