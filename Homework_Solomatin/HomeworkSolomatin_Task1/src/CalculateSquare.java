import java.util.Scanner;

public class CalculateSquare {
    private static final double PI = Math.PI;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите 3 радиуса: r1, r2 и r3: ");
        double r1 = scanner();
        double r2 = scanner();
        double r3 = scanner();

        double shadedSquare = calculateShadedSquare(r1 ,r2, r3);
        System.out.println("Заштрихованная область: " + shadedSquare);
    }

    private static double calculateShadedSquare(double r1, double r2, double r3) {

        double squareCircleR1 = (calculateSquareCircle(r1) - calculateSquareCircle(r2)) / 8;
        double squareCircleR2 = (((calculateSquareCircle(r2)) - calculateSquareCircle(r3)) / 8) * 5;
        double squareCircleR3 = ((calculateSquareCircle(r3)) / 8) * 2;

        double squareQuadrate = ((calculateSquare(r1) - calculateSquareCircle(r1)) / 8) * 4;

        return squareCircleR1 + squareCircleR2 + squareCircleR3 + squareQuadrate;
    }

    private static double calculateSquareCircle(double r) {
        return PI * Math.pow(r, 2);
    }

    private static double calculateSquare(double r) {
        return Math.pow(Math.pow(r, 2), 2);
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
