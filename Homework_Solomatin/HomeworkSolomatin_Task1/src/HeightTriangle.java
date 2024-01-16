import java.util.Scanner;

public class HeightTriangle {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите a, b и с для треугольника: ");
        double a = scanner();
        double b = scanner();
        double c = scanner();

        double heightA = calculateHeightA(a, b, c);
        double heightB = calculateHeightB(a, b, c);
        double heightC = calculateHeightC(a, b, c);

        System.out.println("Высота для вершины A: " +  heightA);
        System.out.println("Высота для вершины B: " + heightB);
        System.out.println("Высота для вершины C: " + heightC);
    }

    private static double calculateHeightA(double a, double b, double c) {
        double p = calculateP(a, b, c);
        return (2 / a) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double calculateHeightB(double a, double b, double c) {
        double p = calculateP(a, b, c);
        return (2 / b) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double calculateHeightC(double a, double b, double c) {
        double p = calculateP(a, b, c);
        return (2 / c) * Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double calculateP(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    private static double scanner() {
        double num = 0;
        boolean isValidateInput = false;

        while (!isValidateInput) {
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                isValidateInput = true;
            } else {
                System.out.println("Вы вводите не число");
                scanner.next();
            }
        }
        return num;
    }
}
