import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 25.10.15.
 */

// Дано целое число. Вывести его строкуописание
// вида «отрицательное четное число», «нулевое число»,
// «положительное нечетное число» и т. д.

public class if029 {

    private static class Input {
        private Scanner s;
        private int a;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getA() {

            return a;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите целое число А: ");
            a = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int a = input.getA();

        String result = null;
        String result1 = "отрицательное четное число";
        String result2 = "отрицательное нечетное число";
        String result3 = "нулевое число";
        String result4 = "положительное четное число";
        String result5 = "положительное нечетное число";

        if (a < 0 && a % 2 == 0) {
            result = result1;
        } else if (a < 0 && a % 2 != 0) {
            result = result2;
        } else if (a == 0) {
            result = result3;
        } else if (a > 0 && a % 2 == 0){
            result = result4;
        } else if (a > 0 && a % 2 != 0) {
            result = result5;
        }
        Final(result);
    }

    private static void Final(String result) {
        System.out.println();
        System.out.println("Данное число :");
        System.out.println(result);
    }
}