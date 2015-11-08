import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 04.10.15.
 */

// Даны целочисленные координаты точки на плоскости.
// Если точка совпадает с началом координат, то вывести 0.
// Если точка не совпадает с началом координат, но лежит на оси OX или OY,
// то вывести соответственно 1 или 2. Если точка не лежит
// на координатных осях, то вывести 3.

public class If021 {

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

        int a = 0; // вспомогательная переменная
        String result = null;
        String final1 = "Совпадает с началом координа.";
        String final2 = "Лежит на оси OX.";
        String final3 = "Лежит на оси OY.";
        String final4 = "Не лежит на координатных осях.";

        if (x == 0 && y == 0) {
            a = 0;
            result = final1;
        } else if (x != 0 && y == 0) {
            a = 1;
            result = final2;
        } else if (x == 0 && y != 0) {
            a = 2;
            result = final3;
        } else if (x!=0 && y!=0){
            a= 3;
            result = final4;
        }

        Final(x, y, a, result);
    }

    private static void Final(int x, int y, int a, String result) {
        System.out.println();
        System.out.println("Введеная вами точка : " + x + "," + y);
        System.out.println(result);
        System.out.println("Поэтому мы выводим : " + a);
    }
}