import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 07.09.15.
 */

// Даны два числа. Вывести вначале большее, а затем меньшее из них.

public class If008 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите число а : ");
        int a = s.nextInt();
        System.out.print("Введите число b : ");
        int b = s.nextInt();
        System.out.println();

        int biggerNumber;
        int smallerNumber;

        if (a > b) {
            biggerNumber = a;
        } else biggerNumber = b;

        if (biggerNumber == a) {
            smallerNumber = b;
        } else smallerNumber = a;

        System.out.println("Большее число = " + biggerNumber + ".");
        System.out.println("Меньшее число = " + smallerNumber + ".");
    }
}