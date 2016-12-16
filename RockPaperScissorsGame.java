package exercise1;

/**
 * RockPaperScissorsGame to decide winner based on players selection
 * 
 * @author vgup77
 *
 */
public class RockPaperScissorsGame {

    /**
     * playGame accepts players selections and decides which player wins.
     * 
     * @param frstChoice
     * @param scndChoice
     * @return
     */
    public GameResult playGame(Options frstSelection, Options scndSelection) {
        GameResult result = new GameResult();
        if (frstSelection==scndSelection)
            result.setResult(GameConstants.TIE);
        return result;
    }

}
