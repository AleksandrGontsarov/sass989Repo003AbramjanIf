import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 06.09.15.
 */

// Даны два числа. Вывести большее из них.

public class If006 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число а : ");
        int a = s.nextInt();
        System.out.print("Введите число b : ");
        int b = s.nextInt();
        System.out.println();

        int biggerNumber;

        if (a > b) {
            biggerNumber = a;
        } else biggerNumber = b;

        System.out.println("Большее число = " + biggerNumber + ".");
    }
}