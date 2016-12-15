package exercise1;

import org.junit.Test;


public class RockPaperScissorProblemTest {
    
    private static final RockPaperScissorProblem rPSObj= new RockPaperScissorProblem();
    
    @Test(expected = RuntimeException.class)
    public final void whenWrongInputsAreUsedThenExceptionIsThrown() {
        rPSObj.compareChoices("A", "B");
    }
    
    
    

}
