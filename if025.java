import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 24.10.15.
 */

// Для данного целого x найти значение
// следующей функции f, принимающей значения целого типа:
// f(x) = ￼2·x, если x < –2 или x > 2,
// f(x) = –3·x, в противном случае.

public class if025 {
    private static class Input {
        private Scanner s;
        private int x;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getX1() {

            return x;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число X: ");
            x = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int x = input.getX1();

        int f = 0; // функция
        String result;
        String result1 = "Так как х меньше чем -2, либо больше чем 2, следовательно" + "\n" +
                "считаем функцию : f(x) = 2·x";
        String result2 = "Так как х больше или равно чем -2, и меньше или равно чем 2, следовательно" + "\n" +
                "считаем функцию : f(x) = -3·x";

        if (x < -2 || x > 2) {
            f = 2 * x;
            result = result1;

        } else {
            f = -3*x;
            result = result2;
        }

//        f = Math.rint(100.0 * f) / 100.0; // округление до сотых

        Final(result, f);
    }

    private static void Final(String result, int f) {
        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("f(x) = " + f);
    }
}