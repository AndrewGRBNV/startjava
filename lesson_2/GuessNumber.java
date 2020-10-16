import java.util.Scanner;

class GuessNumber {

    public static int inputNumber() {
        Scanner scan = new Scanner(System.in);
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if ((number < 0) || (number > 100)) {
                System.out.println("Число введено не верно, число меньше 0 или число больше 100, введите число заново ");
                return inputNumber();
            } else {
                return number;
            }
        } else {
            System.out.println("Число введено не верно, введите число заново ");
            return inputNumber();
        }
    }

    public static boolean testNumber(int unknownNumber, int inputNumber) {
        if (unknownNumber == inputNumber) {
            return true;
        } else {
            if (unknownNumber < inputNumber) {
                System.out.println("Введённое Вами число больше загаданного");
            } else {
                System.out.println("Введённое Вами число меньше загаданного");
            }
            return false;
        }
    }
}