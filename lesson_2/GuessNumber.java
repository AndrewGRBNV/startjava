import java.util.Random;
import java.util.Scanner;

class GuessNumber {

    public String playerName (char number) {
        System.out.println("Введите имя игрока " + number);
        Scanner scan = new Scanner(System.in);
        return  (scan.next());
    }

    public int guessRandom() {
        System.out.println("Компьютер загадал число от 0 до 100, Вам нужно его отгадать");
        Random random = new Random();
        return random.nextInt(100);
    }

    public int inputNumber() {
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

    public boolean testNumber(int unknownNumber, int inputNumber) {
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

    public boolean testPlayer(Player player, int unknownNumber) {
        System.out.println("Игрок " + player.getName() + " введите число");
        player.setNumber(inputNumber());
        if (testNumber(unknownNumber, player.getNumber())) {
            System.out.println("Вы угадали число");
            return true;
        }
        return false;
    }

    public boolean inputYesNo() {
        System.out.println("Хотите продолжить? да / нет");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            switch (scan.next()) {
                case "да":
                    return true;
                case "нет":
                    return false;
                default:
                    return inputYesNo();
            }
        }
        return inputYesNo();
    }

    public void runGame(Player player_0,Player player_1) {
        int unknownNumber = guessRandom();
        while (true) {
            if (testPlayer(player_0, unknownNumber)){
                break;
            }
            if (testPlayer(player_1, unknownNumber)){
                break;
            }
        }
    }
}