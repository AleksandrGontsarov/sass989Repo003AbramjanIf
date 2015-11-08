import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 07.09.15.
 */

// Даны два числа. Вывести порядковый номер меньшего из них.

public class If007 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите первое число а : ");
        int a = s.nextInt();
        System.out.print("Введите второе число b : ");
        int b = s.nextInt();
        System.out.println();

        String result;
        String first = "1-ый";
        String second = "2-ой";

        if (a<b){
            result = first;
        }else result = second;

        System.out.println("Порядковый номер меньшего числа : " + result + ".");
    }
}