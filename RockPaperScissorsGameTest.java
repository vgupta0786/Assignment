package exercise1;

import static exercise1.Options.ROCK;
import static exercise1.Options.SCISSORS;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author vgup77
 *
 */
public class RockPaperScissorsGameTest {

    /**
     * instantiates RockPaperScissorsGame
     */
    private static final RockPaperScissorsGame game = new RockPaperScissorsGame();

    /**
     * test playGame method returns not null object
     */
    @Test
    public final void whenInputsArePassedThanResultShouldNotBeNull() {
        assertNotNull(game.playGame(ROCK, SCISSORS));
    }
    
    /**
     * test playGame method returns not null object
     */
    @Test
    public final void whenInputsArePassedThanResultShouldBeGameResult() {
        assertTrue(game.playGame(ROCK, SCISSORS) instanceof GameResult);
     }
    
   
    
   

}
