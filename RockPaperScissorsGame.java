package exercise1;

import java.util.HashMap;
import java.util.Map;
import static exercise1.Options.*;

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
        if (frstSelection == scndSelection) {
            result.setResult(GameConstants.TIE);
            return result;
        }
        Map<Options, Options> container = new HashMap<Options, Options>();
        container.put(ROCK, SCISSORS);
        container.put(SCISSORS, PAPER);
        container.put(PAPER, ROCK);
        if (container.get(frstSelection) == scndSelection)
            result.setResult(GameConstants.FIRST_PLAYER_WIN);
        else
            result.setResult(GameConstants.SECOND_PLAYER_WIN);
        return result;
    }

}
