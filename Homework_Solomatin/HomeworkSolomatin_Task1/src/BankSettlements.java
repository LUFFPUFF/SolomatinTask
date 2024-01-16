import java.util.Scanner;

public class BankSettlements {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите кол-во денег которые кладутся в банк: ");
        double m = scanner();
        System.out.println("Введите процентную ставку: ");
        double k = scanner();
        System.out.println("Введите кол-во дней: ");
        double n = scanner();

        double result = calculateBankSettlements(m, k, n);
        System.out.println("Сумма в банке через " + n + " дней: " + result);
    }

    private static double calculateBankSettlements(double m, double k, double n) {
        return  m * Math.pow((1 + k / 100), n) - m;
    }

    private static double scanner() {
        double num = 0;
        boolean isValidateInput = false;

        while (!isValidateInput) {
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                isValidateInput = true;
            } else {
                System.out.println("Вы вводите не число, попробуйте еще раз");
                scanner.next();
            }
        }
        return num;
    }
}
