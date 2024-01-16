package programtask;

import figures.Circle;
import figures.Line;
import figures.VerticalParabola;

import java.util.Scanner;

public class ProgramTask66 {
    private static final Circle circle = new Circle(- 8, -4, 5);
    private static final Line line = new Line(-2, -5, -1);
    private static final VerticalParabola verticalParabola =
            new VerticalParabola(5, -4, -0.25);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("введите координату: ");
        System.out.println("Введите X: ");
        double x = readDouble();
        System.out.println("Введите Y: ");
        double y = readDouble();

        printColorForPoint(-6, -2);
        printColorForPoint(-6, 0);
        printColorForPoint(2, -7);
        printColorForPoint(2, -10);
        printColorForPoint(-1, -7);
        System.out.println("Input X: " + x + "\n" + "Input Y: " + y);
        printColorForPoint(x, y);
    }
    private static void printColorForPoint(double x, double y) {
        SimpleColor color = getColor(x, y);
        System.out.println("Цвет для точки " + "(" + x + ", " + y + ") " + "- " + color);
    }
    private static SimpleColor getColor(double x, double y) {
        if (circle.isPointInsideCircle(x, y) && line.isPointBellowLine(x, y)) {
            return SimpleColor.WHITE;
        }
        if (circle.isPointInsideCircle(x, y) && line.isPointAboveLine(x, y)) {
            return SimpleColor.GRAY;
        }
        if (verticalParabola.isPointBellowParabola(x, y) && line.isPointAboveLine(x, y)) {
            return SimpleColor.WHITE;
        }
        if (verticalParabola.isPointBellowParabola(x, y) && line.isPointBellowLine(x, y)) {
            return SimpleColor.BLUE;
        }
        if (circle.isPointOutsideCircle(x, y) && verticalParabola.isPointAboveParabola(x, y) &&
        line.isPointBellowLine(x, y)) {
            return SimpleColor.GREEN;
        }
        return SimpleColor.BLUE;
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
