import java.util.Scanner;

/**
 * Created by Aleksandr Gontsarov on 14.10.15.
 */

// Даны целочисленные координаты трех вершин прямоугольника,
// стороны которого параллельны координатным осям.
// Найти координаты его четвертой вершины.

public class if023 {
    private static class Input {
        private Scanner s;
        private int x1;
        private int x2;
        private int x3;
        private int y1;
        private int y2;
        private int y3;

        public Input(Scanner s) {

            this.s = s;
        }

        public Input() {

        }

        public int getX1() {

            return x1;
        }

        public int getX2() {

            return x2;
        }

        public int getX3() {

            return x3;
        }

        public int getY1() {

            return y1;
        }

        public int getY2() {

            return y2;
        }

        public int getY3() {

            return y3;
        }

        public Input invoke() {
            System.out.println();
            System.out.println("Введите координаты трех вершин прямоугольника,");
            System.out.println("Стороны которого параллельны координатным осям");
            System.out.println();
            System.out.println("   ^                                      ");
            System.out.println("  x|                                      ");
            System.out.println("   |      B_______________ C              ");
            System.out.println("   |      |               |               ");
            System.out.println("   |      |               |               ");
            System.out.println("   |      |               |               ");
            System.out.println("   |      |               |               ");
            System.out.println("   |      |_______________|               ");
            System.out.println("   |      A                D              ");
            System.out.println("  -|--------------------------------->    ");
            System.out.println("   |                        y             ");
            System.out.println("                                          ");
            System.out.println();
            System.out.print("Введите X1 (точка А): ");
            x1 = s.nextInt();
            System.out.print("Введите Y1 (точка А): ");
            y1 = s.nextInt();
            System.out.println();
            System.out.print("Введите X2 (точка В): ");
            x2 = s.nextInt();
            System.out.print("Введите Y2 (точка В): ");
            y2 = s.nextInt();
            System.out.println();
            System.out.print("Введите X3 (точка С): ");
            x3 = s.nextInt();
            System.out.print("Введите Y3 (точка С): ");
            y3 = s.nextInt();
            System.out.println();
            return this;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Input input = new Input(s).invoke();
        int x1 = input.getX1();
        int y1 = input.getY1();
        int x2 = input.getX2();
        int y2 = input.getY2();
        int x3 = input.getX3();
        int y3 = input.getY3();

        int x4 = 0;
        int y4 = 0;
        String result;
        String result1;
        String AB = "Сторона АВ паралельна оси ОХ.";
        String BC = "Сторона BC паралельна оси ОY.";
        String Y1Y2 = "Координата y1 должна быть равна y2,";
        String X2X3 = "Координата x2 должна быть равна x3,";
        String rectangle = "так как стороны прямоугольника параллельны координатным осям.";

        if (y1 == y2) {
            result = AB;
        } else {
            result = Y1Y2;
            Final1(result, rectangle);
        }

        if (x2 == x3) {
            result1 = BC;
        } else {
            result1 = X2X3;
            Final2(result1, rectangle);
        }


        if (result == AB && result1 == BC) {
            x4 = x1;
            y4 = y3;
            Final(x4, y4, result, result1);
        }
    }

    private static void Final1(String result, String rectangle){
        System.out.println();
        System.out.println(result);
        System.out.println(rectangle);
    }

    private static void Final2(String result1, String rectangle){
        System.out.println();
        System.out.println(result1);
        System.out.println(rectangle);
    }

    private static void Final(int x4, int y4, String result, String result1) {
        System.out.println();
        System.out.println(result);
        System.out.println(result1);
        System.out.println();
        System.out.println("Следовательно : ");
        System.out.println("координаты четвертой точки D : ");
        System.out.println("x4 : " + x4 + ", y4 : " + y4);
    }
}