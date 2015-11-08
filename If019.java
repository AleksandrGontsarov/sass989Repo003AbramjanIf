import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 30.09.15.
 */

// Даны четыре целых числа, одно из которых
// отлично от трех других, равных между собой.
// Определить порядковый номер числа, отличного от остальных.

public class If019 {

    private static class Input {
        private Scanner s;
        private int a;
        private int b;
        private int c;
        private int d;

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

        public int getD() {

            return d;
        }

        public Input invoke() {
            System.out.println();
            System.out.println("Введите четыре целых числа,");
            System.out.println("одно из которых отлично от трех других, равных между собой.");
            System.out.println();
            System.out.print("Введите число A : ");
            a = s.nextInt();
            System.out.print("Введите число B : ");
            b = s.nextInt();
            System.out.print("Введите число C : ");
            c = s.nextInt();
            System.out.print("Введите число D : ");
            d = s.nextInt();
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
        int d = input.getD();

        int e = 0; // вспомагательная переменная, к которой будет
        // присваиваться значение числа отличного от других
        String result = null; // строка показывыет какое число(буква) отличное от других
        String SerialNumber = null; // строка показывыет порядковый номер числа отличного от других
        String matches = null; // строка показывыет есть-ли совпадения между числами
        String EqualityNunbers = null; // строка показывыет какие числа совпали

        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";

        String ABC = "Числа А,В,C равны друг другу : ";
        String ABD = "Числа А,B,D равны друг другу : ";
        String BCD = "Числа B,C,D равны друг другу : ";
        String ACD = "Числа A,C,D равны друг другу : ";

        String Equality = "Три числа равны между собой : ";
        String Inequality = "Ни одно число ни равно другому";
        String first = "Первый";
        String second = "Второй";
        String third = "Третий";
        String fourth = "Четвертый";

        if (a == b && a == c) {
            e = d;
            result = D;
            SerialNumber = fourth;
            matches = Equality;
            EqualityNunbers = ABC;
            Check(matches, EqualityNunbers);
            Final(e, result, SerialNumber);
        } else if (a == b && a == d) {
            e = c;
            result = C;
            SerialNumber = third;
            matches = Equality;
            EqualityNunbers = ABD;
            Check(matches, EqualityNunbers);
            Final(e, result, SerialNumber);
        } else if (b == c && b == d) {
            e = a;
            result = A;
            SerialNumber = first;
            matches = Equality;
            EqualityNunbers = BCD;
            Check(matches, EqualityNunbers);
            Final(e, result, SerialNumber);
        } else if (a == c && a == d) {
            e = b;
            result = B;
            SerialNumber = second;
            matches = Equality;
            EqualityNunbers = ACD;
            Check(matches, EqualityNunbers);
            Final(e, result, SerialNumber);
        } else if ((a != b && a != c) || (a != b && a != d) || (b != c && b != d) || (a != c && a != d)) {
            matches = Inequality;
            Check(matches, EqualityNunbers);
            new Input(s).invoke();
            Final(e, result, SerialNumber);
        }

//        Check(matches, EqualityNunbers);
//
//        Final(e, result, SerialNumber);
    }

    private static void Check(String matches, String equalityNunbers) {
        System.out.println();
        System.out.println("Проверим сначала есть-ли равные друг другу числа :");
        System.out.println();
        System.out.println(matches);
        System.out.println();
        System.out.println(equalityNunbers);
        System.out.println();
    }

    private static void Final(int e, String result, String serialNumber) {
        System.out.println("Порядковый номер числа отличного отдругих : ");
        System.out.println(serialNumber + " : " + result + " : " + e);
    }
}