package programtask;

import figures.HorizontalLine;
import figures.HorizontalParabola;
import figures.Line;
import figures.VerticalParabola;

import java.util.Scanner;

public class ProgramTask97 {
    private static final HorizontalLine horizontalLine = new HorizontalLine(-4);
    private static final Line line = new Line(0, 7, 2);
    private static final HorizontalParabola horizontalParabola
            = new HorizontalParabola(5, -2, -0.25);
    private static final VerticalParabola verticalParabola
            = new VerticalParabola(-2, -6, 0.25);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите координату: ");
        System.out.println("Введите X: ");
        double x = readDouble();
        System.out.println("Введите Y: ");
        double y = readDouble();

        printColorForPoint(1, 1);
        printColorForPoint(-1, 1);
        printColorForPoint(-4, 1);
        printColorForPoint(-4, 5);
        printColorForPoint(-2, -5);
        printColorForPoint(-4, -7);
        printColorForPoint(5, -6);
        printColorForPoint(5, 0);
        printColorForPoint(1, 3);
        printColorForPoint(-10, 7);
        printColorForPoint(-10, -10);
        printColorForPoint(-8, 0);
        System.out.println("Input X: " + x + "\n" + "Input Y: " + y);
        printColorForPoint(x, y);
    }

    public static void printColorForPoint(double x, double y) {
        SimpleColor color = getColor(x, y);
        System.out.println("Цвет для точки " + "(" + x + ", " + y + ") " + "- " + color);
    }

    public static SimpleColor getColor(double x, double y) {
        if (((verticalParabola.isPointInsideParabola(x, y) || horizontalParabola.isPointLeftOfParabola(x,y))
                && line.isPointBellowLine(x, y) && horizontalLine.isPointAboveLine(y)) ||
                (horizontalParabola.isPointRightOfParabola(x, y) && line.isPointAboveLine(x, y) && y < -9)) {
            return SimpleColor.BLUE;
        }
        if ((verticalParabola.isPointAboveParabola(x, y) && horizontalLine.isPointBelowLine(y)) ||
                (horizontalParabola.isPointLeftOfParabola(x, y) && line.isPointBellowLine(x, y) && horizontalLine.isPointBelowLine(y)) ||
                (verticalParabola.isPointAboveParabola(x, y) && horizontalParabola.isPointOutsideParabola(x, y) &&
                        line.isPointBellowLine(x, y))) {
            return SimpleColor.WHITE;
        }
        if ((verticalParabola.isPointAboveParabola(x, y) && line.isPointAboveLine(x, y) &&
        horizontalParabola.isPointLeftOfParabola(x, y)) ||
                (horizontalParabola.isPointOutsideParabola(x, y) && horizontalLine.isPointBelowLine(y))) {
            return SimpleColor.YELLOW;
        }
        if ((horizontalParabola.isPointRightOfParabola(x, y) && line.isPointAboveLine(x, y) &&
        verticalParabola.isPointAboveParabola(x, y)) ||
                (horizontalParabola.isPointOutsideParabola(x, y) && verticalParabola.isPointOutsideParabola(x, y) &&
                        horizontalLine.isPointAboveLine(y) && x > 0)) {
            return SimpleColor.ORANGE;
        }
        if (horizontalParabola.isPointLeftOfParabola(x, y) && verticalParabola.isPointBellowParabola(x, y) &&
                line.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }
        if (horizontalParabola.isPointOutsideParabola(x, y) && verticalParabola.isPointOutsideParabola(x, y) &&
                line.isPointAboveLine(x, y) && x < 0) {
            return SimpleColor.GRAY;
        }
        return SimpleColor.BLACK;
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
