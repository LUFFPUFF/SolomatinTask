import java.util.Scanner;

public class MoreLessEqual {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите 3 числа: a, b, c ");
        double a = scanner();
        double b = scanner();
        double c = scanner();

        System.out.println(moreLessEqual(a, b, c));
    }

    private static String moreLessEqual(double a, double b, double c) {
        if (a <= b && b <= c) {
            return "a <= b <= c";
        } else if (b <= a && a <= c) {
            return "b <= a <= c";
        } else if (c <= a && a <= b) {
            return "c <= a <= b";
        } else if (b <= c) {
            return "b <= c <= a";
        } else {
            return "c <= b <= a";
        }
    }

    public static double scanner() {
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
