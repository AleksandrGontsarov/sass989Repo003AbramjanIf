import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 25.10.15.
 */

// Для данного вещественного x найти значение
// следующей функции f, принимающей значения целого типа:
// f(x) = 0, если x < 0,
// f(x) = 1, если x принадлежит [0, 1), [2, 3), ... ,
// f(x) = –1, если x принадлежит [1, 2), [3, 4), ... .

// Для обозначения числовых промежутков используются пары
// скобок четырех видов: ( ), ( ], [ ) и [ ].
// Внутри этих скобок через точку с запятой или через запятую
// указываются два числа – сначала меньшее, затем большее,
// ограничивающие числовой промежуток.
// Круглая скобка, прилегающая к числу, означает,
// что это число не включено в промежуток,
// а квадратная – что число включено.

public class if027 {
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

        int x1 = (int) x; // извлечение целового числа из х

        double f = 0; // функция
        String result = null;
        String result1 = "Так как х меньше нуля, следовательно считаем функцию :" + "\n" +
                "f(x) = 0";
        String result2 = "Так как х принадлежит [0, 1), [2, 3), ... , следовательно считаем функцию :" + "\n" +
                "f(x) = 1";
        String result3 = "Так как х принадлежит [1, 2), [3, 4), ... , следовательно считаем функцию :" + "\n" +
                "f(x) = -1";

//        System.out.println(x = x % 2);
//        System.out.println(x1 % 2);

        if (x < 0) {
            f = 0;
            result = result1;
        } else if (x1 % 2 == 0) {
            f = 1;
            result = result2;
        } else if (x1 % 2 > 0) {
            f = -1;
            result = result3;
        }

//        f = Math.rint(100.0 * f) / 100.0; // округление до сотых

        Final(result, f);
    }

    private static void Final(String result, double f) {
        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("f(x) = " + f);
    }
}