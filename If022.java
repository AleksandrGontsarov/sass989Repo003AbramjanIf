import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 11.10.15.
 */

// Даны координаты точки, не лежащей на координатных осях OX и OY.
// Определить номер координатной четверти, в которой находится данная точка.

public class If022 {
    private static class Input {
        private Scanner s;
        private int x;
        private int y;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getX() {

            return x;
        }

        public int getY() {

            return y;
        }

        public Input invoke() {
            System.out.println();
            System.out.println("Введите целочисленные координаты точки на плоскости.");
            System.out.println();
            System.out.print("Введите X : ");
            x = s.nextInt();
            System.out.print("Введите Y : ");
            y = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int x = input.getX();
        int y = input.getY();

        String result = null;
        String final1 = "Лежит в 1-ой координатной четверти.";
        String final2 = "Лежит во 2-ой координатной четверти.";
        String final3 = "Лежит в 3-ей координатной четверти.";
        String final4 = "Лежит в 4-ой координатной четверти.";
        String finalOX = "Лежит на координатной оси OX.";
        String finalOY = "Лежит на координатной оси OY.";
        String final0 = "Лежит в начале координат.";

        if (x == 0 && y == 0) {
            result = final0;
        } else if (x > 0 && y > 0) {
            result = final1;
        } else if (x < 0 && y > 0) {
            result = final2;
        } else if (x < 0 && y < 0) {
            result = final3;
        } else if (x > 0 && y < 0) {
            result = final4;
        } else if (x != 0 && y == 0) {
            result = finalOX;
        } else if (x == 0 && y != 0) {
            result = finalOY;
        }

        Final(x, y, result);
    }

    private static void Final(int x, int y, String result) {
        System.out.println();
        System.out.println("Введеная вами точка : " + x + "," + y);
        System.out.println(result);
    }
}