import java.util.Random;
import java.util.Scanner;

class GuessNumber {

    public Player inputPlayer_0() {
        System.out.println("Введите имя первого игрока");
        Player player_0 = new Player();
        Scanner scan = new Scanner(System.in);
        player_0.setName(scan.next());
        return  player_0;
    }

    public Player inputPlayer_1() {
        System.out.println("Введите имя второго игрока");
        Player player_1 = new Player();
        Scanner scan = new Scanner(System.in);
        player_1.setName(scan.next());
        return  player_1;
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
        player.setNumber(GuessNumber.inputNumber());
        if (GuessNumber.testNumber(unknownNumber, player.getNumber())) {
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
}