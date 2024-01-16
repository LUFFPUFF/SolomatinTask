package programtask;

import figures.*;

import java.util.Scanner;

public class ProgramTask78 {
    private static final VerticalParabola verticalParabola =
            new VerticalParabola(2, -4, 0.2);
    private static final HorizontalParabola horizontalParabolaRight =
            new HorizontalParabola(-1, 4, 0.5);
    private static final HorizontalParabola horizontalParabolaLeft =
            new HorizontalParabola(-4, 0, -0.5);
    private static final Circle circle = new Circle(4, -5, 2);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите координату: ");
        System.out.println("Введите X: ");
        double x = readDouble();
        System.out.println("Введите Y: ");
        double y = readDouble();

        printColorForPoint(4, -5);
        printColorForPoint(4, -3.1);
        printColorForPoint(-5, 0);
        printColorForPoint(1, 1);
        printColorForPoint(1, 3);
        printColorForPoint(8, 0);
        printColorForPoint(-1, -4);
        System.out.println("Input X: " + x + "\n" + "Input Y: " + y);
        printColorForPoint(x, y);
    }
    private static void printColorForPoint(double x, double y) {
        SimpleColor color = getColor(x, y);
        System.out.println("Цвет для точки " + "(" + x + ", " + y + ") " + "- " + color);
    }
    private static SimpleColor getColor(double x, double y) {
        if (circle.isPointInsideCircle(x, y) && verticalParabola.isPointBellowParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (circle.isPointInsideCircle(x, y) && verticalParabola.isPointAboveParabola(x, y)) {
            return SimpleColor.WHITE;
        }
        if (horizontalParabolaLeft.isPointLeftOfParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (verticalParabola.isPointAboveParabola(x, y) && horizontalParabolaRight.isPointLeftOfParabola(x, y) &&
        circle.isPointOutsideCircle(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (horizontalParabolaRight.isPointRightOfParabola(x, y) && verticalParabola.isPointAboveParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (horizontalParabolaRight.isPointRightOfParabola(x, y)) {
            verticalParabola.isPointBellowParabola(x, y);
        }
        return SimpleColor.WHITE;
    }

    private static double readDouble() {
        double num = 0;
        boolean isValidateInput = false;
        while (!isValidateInput) {
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                isValidateInput = true;
            } else  {
                System.out.println("Вы вводите не число, попробуйте еще раз");
                scanner.next();
            }
        }
        return num;
    }
}
