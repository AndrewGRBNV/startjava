import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {

        boolean runGuessNumberTest = true;
        while (runGuessNumberTest) {
            GuessNumber game = new GuessNumber();
            Player player_0 = new Player(game.playerName('1'));
            Player player_1 = new Player(game.playerName('2'));
            game.runGame(player_0,player_1);
            runGuessNumberTest = inputYesNo();
        } while (runGuessNumberTest);
    }

    private static boolean inputYesNo() {
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