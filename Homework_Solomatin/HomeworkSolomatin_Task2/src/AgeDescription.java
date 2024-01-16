import java.util.Scanner;

public class AgeDescription {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите свой возраст: ");
        int age = scanner();

        String ageDescription = getAgeDescription(age);
        System.out.println(ageDescription);
    }

    public static String getAgeDescription(int age) {
        if (age < 1 || age > 99) {
            System.out.println("Некорректный возраст");
        }
        
        if (age % 10 == 1 && age != 11) {
            return age + " год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) && !(age >= 12 && age <= 14)) {
            return age + " года";
        } else {
            return age + " лет";
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
