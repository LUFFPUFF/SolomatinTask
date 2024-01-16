import java.util.Scanner;

public class PointInTime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первые три числа в виде: часы, минуты, секунды");
        int h1 = scanner();
        int m1 = scanner();
        int s1 = scanner();

        System.out.println("Введите вторые три числа в виде: часы, минуты, секунды");
        int h2 = scanner();
        int m2 = scanner();
        int s2 = scanner();

        int result = calculatePointInTime(h1, m1, s1, h2, m2, s2);

        System.out.println("Расчет времени между первым и вторым моментом времени: " + result + " сек.");
    }

    private static int calculatePointInTime(int h1, int m1, int s1, int h2, int m2, int s2) {
        int hour = (h2 - h1) * 3600;
        int minute = (m2 - m1) * 60;
        int seconds = (s2 - s1);
        return hour + minute + seconds;
    }

    private static int scanner() {
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
