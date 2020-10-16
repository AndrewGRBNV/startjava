import java.util.Random;
import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        boolean runCalculator = true;
        while (runCalculator) {
            System.out.println("Введите имя первого игрока");
            Player Player_0 = new Player() {};
            Scanner scan = new Scanner(System.in);
            Player_0.setName(scan.next());
            System.out.println("Введите имя второго игрока");
            Player Player_1 = new Player() {};
            Player_1.setName(scan.next());
            Random random = new Random();
            int unknownNumber = random.nextInt(100);
            System.out.println("Компьютер загадал число от 0 до 100, Вам нужно его отгадать");
            while (true) {
                System.out.println("Игрок " + Player_0.getName() + " введите число");
                Player_0.setNumber(GuessNumber.inputNumber());
                if (GuessNumber.testNumber(unknownNumber, Player_0.getNumber())) {
                    System.out.println("Вы угадали число");
                    break;
                }
                System.out.println("Игрок " + Player_1.getName() + " введите число");
                Player_1.setNumber(GuessNumber.inputNumber());
                if (GuessNumber.testNumber(unknownNumber, Player_1.getNumber())) {
                    System.out.println("Вы угадали число");
                    break;
                }
            }
            runCalculator = Calculator_2.inputYesNo();
        } while (runCalculator);
    }
}