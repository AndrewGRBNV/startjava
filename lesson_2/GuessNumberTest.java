class GuessNumberTest {

    public static void main(String[] args) {
        boolean runGuessNumberTest = true;
        while (runGuessNumberTest) {
            GuessNumber game = new GuessNumber();
            Player player_0 = new Player(game.playerName('1'));
            Player player_1 = new Player(game.playerName('2'));
            game.runGame(player_0,player_1);
            runGuessNumberTest = game.inputYesNo();
        } while (runGuessNumberTest);
    }
}