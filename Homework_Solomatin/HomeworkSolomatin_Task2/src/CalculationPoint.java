import java.util.Scanner;

public class CalculationPoint {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите название команд: ");
        String nameTeam1 = new Scanner(System.in).nextLine();
        String nameTeam2 = new Scanner(System.in).nextLine();

        System.out.println("Введите счет матча: ");
        int N = scanner();
        int M = scanner();

        int calculatePointTeam1 = calculationPoint(N, M);
        int calculatePointTeam2 = calculationPoint(M, N);

        System.out.println("Команда " + "'" + nameTeam1 + "'" + " заработала " + calculatePointTeam1 + " очков");
        System.out.println("Команда " + "'" + nameTeam2 + "'" + " заработала " + calculatePointTeam2 + " очков");

        if (calculatePointTeam1 > calculatePointTeam2) {
            System.out.println("Победила команда " + nameTeam1);
        } else if (calculatePointTeam1 < calculatePointTeam2) {
            System.out.println("Победила команда " + nameTeam2);
        } else {
            System.out.println("Ничья!");
        }
    }

    private static int calculationPoint(int N, int M) {
        if (N > M) {
            return 3;
        } else if (N < M) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int scanner() {
        int num = 0;
        boolean isValidateInput = false;
        while (!isValidateInput) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                isValidateInput = true;
            } else {
                System.out.println("Вы вводите не число");
                scanner.next();
            }
        }
        return num;
    }
}
