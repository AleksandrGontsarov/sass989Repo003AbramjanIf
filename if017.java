import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 26.09.15.
 */

// Даны три переменные вещественного типа: A, B, C.
// Если их значения упорядочены по возрастанию или убыванию,
// то удвоить их; в противном случае заменить значение каждой
// переменной на противоположное. Вывести новые значения переменных A, B, C.

public class if017 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите дробное число A : ");
        Double a = s.nextDouble();
        System.out.print("Введите дробное число B : ");
        Double b = s.nextDouble();
        System.out.print("Введите дробное число C : ");
        Double c = s.nextDouble();
        System.out.println();

        Double a2 = a * 2;
        Double b2 = b * 2;
        Double c2 = c * 2;

        double aNeg = a * -1;
        double bNeg = b * -1;
        double cNeg = c * -1;

        boolean isTrue;

        if ((a < b && b < c) && (a > b && b > c)) {
            a = a2;
            b = b2;
            c = c2;
            isTrue = true;
        } else {
            a = aNeg;
            b = bNeg;
            c = cNeg;
            isTrue = false;
        }

        String result;
        String pravda = "Истина";
        String nepravda = "Ложь";

        String result2;
        String pravda2 = "Мы удваиваем значение чисел : ";
        String nepravda2 = "Мы заменяем значение чисел на противоположное : ";

        if (isTrue == true) {
            result = pravda;
            result2 = pravda2;
        } else {
            result = nepravda;
            result2 = nepravda2;
        }

        System.out.println();
        System.out.println("Введенные числа упорядочены по возрастанию или убыванию : " + result);
        System.out.println();
        System.out.println(result2);
        System.out.println("A = " + a + ".");
        System.out.println("B = " + b + ".");
        System.out.println("C = " + c + ".");

    }
}