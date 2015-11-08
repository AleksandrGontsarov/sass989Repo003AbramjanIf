import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 18.10.15.
 */

// Для данного вещественного x найти значение
// следующей функции f, принимающей вещественные значения:
// f(x) = 2·sin(x), если x > 0,
// f(x) = 6 – x,    если x ≤ 0.

public class if024 {
    private static class Input {
        private Scanner s;
        private double x;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public double getX1() {

            return x;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите вещественное число X: ");
            x = s.nextDouble();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        double x = input.getX1();

        double f = 0; // функция
        String result;
        String result1 = "Так как х больше нуля, следовательно считаем функцию :" + "\n" +
                "f(x) = 2·sin(x)";
        String result2 = "Так как х меньше или равно нулю, следовательно считаем функцию :" + "\n" +
                "f(x) = 6 – x";

        if (x > 0) {
            f = 2 * Math.sin(x);
            result = result1;

        } else {
            f = 6 - x;
            result = result2;
        }

        f = Math.rint(100.0 * f) / 100.0; // округление до сотых

        Final(result, f);
    }

    private static void Final(String result, double f) {
        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("f(x) = " + f);
    }
}