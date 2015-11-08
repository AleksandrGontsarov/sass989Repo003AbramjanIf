import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 03.10.15.
 */

// На числовой оси расположены три точки: A, B, C.
// Определить, какая из двух последних точек (B или C)
// расположена ближе к A, и вывести эту точку и ее
// расстояние от точки A.

public class if020 {

    private static class Input {
        private Scanner s;
        private int a;
        private int b;
        private int c;
//        private int d;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getA() {

            return a;
        }

        public int getB() {

            return b;
        }

        public int getC() {

            return c;
        }

        //        public int getD() {
//
//            return d;
//        }
        public Input invoke() {
            System.out.println();
            System.out.println("Введите три целых числа,");
            System.out.println("Это будут точки расположенные на числовой прямой.");
            System.out.println();
            System.out.print("Введите число A : ");
            a = s.nextInt();
            System.out.print("Введите число B : ");
            b = s.nextInt();
            System.out.print("Введите число C : ");
            c = s.nextInt();
//            System.out.print("Введите число D : ");
//            d = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int a = input.getA();
        int b = input.getB();
        int c = input.getC();
//        int d = input.getD();

        int ab = a - b; // разница между А и В
        int modAb;      // модуль разницы А и В, т.е. фактическое растояние от А до В
        int ac = a - c; // разница между А и С
        int modAc;      // модуль разницы А и С, т.е. фактическое растояние от А до В

        if (ab >= 0) modAb = ab; // приведение к модулю числа
        else modAb = ab * -1;   // приведение к модулю числа

        if (ac >= 0) modAc = ac; // приведение к модулю числа
        else modAc = ac * -1;   // приведение к модулю числа

        int length = 0; // растояние от точки А до ближайшей точки

        String B = "B"; // точка В
        String C = "C"; // точка С
        String Result = null; // точка ближайшая к точке А

        int result = 0; // точка ближайшая к точке А

        if (modAb > modAc) {
            Result = C;
            result = c;
            length = modAc;
            Final(a, length, Result, result);
        } else if (modAb < modAc) {
            Result = B;
            result = b;
            length = modAb;
            Final(a, length, Result, result);
        } else if (modAb == modAc) {
            length = modAb;
            Final2(a, b, c, length);
        }
    }

    private static void Final2(int a, int b, int c, int length) {
        System.out.println();
        System.out.println("Обе точки В и С находятся на одном раастоянии от точки А");
        System.out.println("Точка B : " + b + "и точка С : " + c + ".");
        System.out.println("Растояние от них до точки А : " + a + " = " + length + ".");
    }

    private static void Final(int a, int length, String result, int result2) {
        System.out.println();
        System.out.println("Ближего всего к точке А расположена");
        System.out.println("Точка : " + result + " : " + result2 + ".");
        System.out.println("Растояние от нее до точки А : " + a + " = " + length + ".");
    }
}