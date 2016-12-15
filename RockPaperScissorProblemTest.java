package exercise1;


import org.junit.Assert;
import org.junit.Test;


public class RockPaperScissorProblemTest {
    
    private static final RockPaperScissorProblem rPSObj= new RockPaperScissorProblem();
    
    @Test(expected = RuntimeException.class)
    public final void whenWrongInputsAreUsedThenExceptionIsThrown() {
        rPSObj.compareChoices("A", "B");
    }
    

    @Test
    public final void whenInputsAreSameThenReturn0() {
        Assert.assertEquals(0, rPSObj.compareChoices("Rock", "Rock"));
    }
    
    @Test
    public final void whenScissorsAndRockAreSelectedThenReturnMinus1() {
        Assert.assertEquals(-1, rPSObj.compareChoices("Scissors", "Rock"));
    }
    
    
    

}
