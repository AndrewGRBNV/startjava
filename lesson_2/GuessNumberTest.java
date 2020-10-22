class GuessNumberTest {

    public void main(String[] args) {
        boolean runGuessNumberTest = true;
        while (runGuessNumberTest) {
            Player player_0 = inputPlayer_0();
            Player player_1 = GuessNumber.inputPlayer_1();
            int unknownNumber = GuessNumber.guessRandom();
            while (true) {
                if (GuessNumber.testPlayer(player_0, unknownNumber)){
                    break;
                }
                if (GuessNumber.testPlayer(player_1, unknownNumber)){
                    break;
                }
            }
            runGuessNumberTest = inputYesNo();
        } while (runGuessNumberTest);
    }
}