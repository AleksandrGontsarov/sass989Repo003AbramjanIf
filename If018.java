import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 27.09.15.
 */

// Даны три целых числа, одно из которых отлично
// от двух других, равных между собой. Определить
// порядковый номер числа, отличного от остальных.

public class If018 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int a = input.getA();
        int b = input.getB();
        int c = input.getC();

        int d = 0; // вспомагательная переменная, к которой будет
                   // присваиваться значение числа отличного от других
        String result = null; // строка показывыет какое число(буква) отличное от других
        String SerialNumber = null; // строка показывыет порядковый номер числа отличного от других
        String matches = null; // строка показывыет есть-ли совпадения между числами
        String EqualityNunbers = null; // строка показывыет какие числа совпали
        String A = "A";
        String B = "B";
        String C = "C";
        String AB = "Числа А и В равны друг другу : ";
        String AC = "Числа А и C равны друг другу : ";
        String BC = "Числа B и C равны друг другу : ";
        String Equality = "Два числа равны между собой : ";
        String Inequality = "Ни одно число ни равно другому";
        String first = "Первый";
        String second = "Второй";
        String third = "Третий";

        if (a == b) {
            d = c;
            result = C;
            SerialNumber = third;
            matches = Equality;
            EqualityNunbers = AB;
        } else if (a == c) {
            d = b;
            result = B;
            SerialNumber = second;
            matches = Equality;
            EqualityNunbers = AC;
        } else if (b == c) {
            d = a;
            result = A;
            SerialNumber = first;
            matches = Equality;
            EqualityNunbers = BC;
        } else if (a != b || a != c || b != c) {
            matches = Inequality;
            new Input();
        }

        System.out.println();
        System.out.println("Проверим сначала есть-ли равные друг другу числа :");
        System.out.println();
        System.out.println(matches);
        System.out.println();
        System.out.println(EqualityNunbers);
        System.out.println();

        System.out.println("Порядковый номер числа отличного отдругих : ");
        System.out.println(SerialNumber + " : " + result + " : " + d);

    }

    private static class Input {
        private Scanner s;
        private int a;
        private int b;
        private int c;

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

        public Input invoke() {
            System.out.println();
            System.out.println("Введите три целых числа,");
            System.out.println("одно из которых отлично от двух других, равных между собой.");
            System.out.println();
            System.out.print("Введите число A : ");
            a = s.nextInt();
            System.out.print("Введите число B : ");
            b = s.nextInt();
            System.out.print("Введите число C : ");
            c = s.nextInt();
            System.out.println();
            return this;
        }
    }
}