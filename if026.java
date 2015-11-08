import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 24.10.15.
 */

// Для данного вещественного x найти значение
// следующей функции f, принимающей вещественные значения:
// f(x) = –x,  если x ≤ 0,
// f(x) = x*x, если 0 < x < 2,
// f(x) = 4,   если x ≥ 2.

public class if026 {
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
        String result = null;
        String result1 = "Так как х больше или равен нулю, следовательно считаем функцию :" + "\n" +
                "f(x) = -х";
        String result2 = "Так как х больше нуля и меньше двух, следовательно считаем функцию :" + "\n" +
                "f(x) = x^2";
        String result3 = "Так как х больше или равен двум, следовательно считаем функцию :" + "\n" +
                "f(x) = 4";

        if (x <= 0) {
            f = -x;
            result = result1;

        } else if (x > 0 && x < 2) {
            f = x * x;
            result = result2;
        } else if (x >= 2) {
            f = 4;
            result = result3;
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