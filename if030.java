import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 31.10.15.
 */

// Дано целое число, лежащее в диапазоне 1–999.
// Вывести его строкуописание вида «четное двузначное число»,
// «нечетное трехзначное число» и т. д.

public class if030 {

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
            System.out.print("Введите целое число А в диапазоне 1-999 : ");
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
        String result1 = "четное однозначное число";
        String result2 = "нечетное однозначное число";
        String result3 = "четное двузначное число";
        String result4 = "нечетное двузначное число";
        String result5 = "четное трехзначное число";
        String result6 = "нечетное трехзначное число";
        String result7 = "не входит в диапазон 1-999";


        if (a > 1 && a < 10 && a % 2 == 0) {
            result = result1;
            Final(result);
        } else if (a > 0 && a < 10 && a % 2 != 0) {
            result = result2;
            Final(result);
        } else if (a > 9 && a < 100 && a % 2 == 0) {
            result = result3;
            Final(result);
        } else if (a > 9 && a < 100 && a % 2 != 0) {
            result = result4;
            Final(result);
        } else if (a > 99 && a < 1000 && a % 2 == 0) {
            result = result5;
            Final(result);
        } else if (a > 99 && a < 1000 && a % 2 != 0) {
            result = result6;
            Final(result);
        } else {
            result = result7;
            Final2(result);
        }
    }

    private static void Final(String result) {
        System.out.println();
        System.out.println("Данное число :");
        System.out.println(result);
    }

    private static void Final2(String result) {
        System.out.println();
        System.out.println("Данное число :");
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println("Введенное число должно быть в диапазоне от 1-го до 999-ти ");
        System.out.println();
        System.out.println("");
    }
}