import java.util.Scanner;

public class Circle {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите длину окружности: ");
        double length = scanner();

        print(length);
    }

    private static void print(double length) {
        double radius = calculateRadius(length);
        double square = calculateSquare(length);

        System.out.printf("Радиус окружности: %.3f %n", radius);
        System.out.printf("Площадь окружности: %.3f %n", square);
    }

    private static double calculateRadius(double length) {
        double diameter = length / Math.PI;
        return diameter / 2;
    }

    private static double calculateSquare(double length) {
        double diameter = length / Math.PI;
        double radius = diameter / 2;
        return Math.PI * Math.pow(radius, 2);
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
