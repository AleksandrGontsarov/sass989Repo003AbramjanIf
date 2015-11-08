import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 25.10.15.
 */

// Дан номер года (положительное целое число).
// Определить количество дней в этом году, учитывая,
// что обычный год насчитывает 365 дней, а високосный — 366 дней.
// Високосным считается год, делящийся на 4, за исключением
// тех годов, которые делятся на 100 и не делятся на 400
// (например, годы 300, 1300 и 1900 не являются високосными,
// а 1200 и 2000 — являются).

public class if028 {

    private static class Input {
        private Scanner s;
        private int x;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getX() {

            return x;
        }

        public Input invoke() {
            System.out.println();
            System.out.print("Введите год: ");
            x = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int x = input.getX();

        String result = null;
        String result1 = "Так как данный год, високосный" + "\n" +
                "следовательно в этом году 366 дней";
        String result2 = "Так как данный год, невисокосный" + "\n" +
                "следовательно в этом году 365 дней";

        if (x % 400 != 0 && x % 100 == 0) {
            result = result2;
        } else if (x % 4 == 0) {
            result = result1;
        } else if (x % 4 != 0) {
            result = result2;
        }

        Final(result);
    }

    private static void Final(String result) {
        System.out.println();
        System.out.println(result);
    }
}