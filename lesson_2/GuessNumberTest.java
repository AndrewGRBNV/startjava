class GuessNumberTest {

    public static void main(String[] args) {
        boolean runGuessNumberTest = true;
        while (runGuessNumberTest) {
            String name = "firt";
            GuessNumber player = new GuessNumber();
            Player player_0 = new Player(player.playerName('1'));
            Player player_1 = new Player(player.playerName('2'));
            int unknownNumber = player.guessRandom();
            while (true) {
                if (player.testPlayer(player_0, unknownNumber)){
                    break;
                }
                if (player.testPlayer(player_1, unknownNumber)){
                    break;
                }
            }
            runGuessNumberTest = player.inputYesNo();
        } while (runGuessNumberTest);
    }
}