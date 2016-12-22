package exercise3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vgup77
 *
 */
public class FizzBuzzStreamsTest {

    private FizzBuzzStreams fizzBuzz;

    /**
     * instantiations
     */
    @Before
    public void setUpStreams() {
        fizzBuzz = new FizzBuzzStreams();
    }

    /**
     * for cleanup
     */
    @After
    public void cleanUpStreams() {
        fizzBuzz = null;
    }

    /**
     * test if number of elements in stream are equivalent to the number passed as method argument
     */
    @Test
    public void shouldGenerateStreamOf2NumbersWhen2AsArgumentIsPassed() {
        List<String> expectedStream = new ArrayList<String>();
        expectedStream.add("1");
        expectedStream.add("2");
        assertEquals(expectedStream, fizzBuzz.printResult(2));
    }
    
    
   /**
    * test when1,2 and 3 are added in stream should read as 1,2 and Fizz
    */
    @Test
   public void when3NumbersAreAddedItShouldReadAsOneTwoFizz() {
       List<String> expectedStream = new ArrayList<String>();
       expectedStream.add("1");
       expectedStream.add("2");
       expectedStream.add("Fizz");
       assertEquals(expectedStream, fizzBuzz.printResult(3));
   }
    
    /**
     * test when multiple of 5 are added in stream than it should read as 1,2,Fizz,4,Buzz
     */
     @Test
    public void whenMultipleOf5AreAddedThanItShouldReadAsBuzz() {
        List<String> expectedStream = new ArrayList<String>();
        expectedStream.add("1");
        expectedStream.add("2");
        expectedStream.add("Fizz");
        expectedStream.add("4");
        expectedStream.add("Buzz");
        assertEquals(expectedStream, fizzBuzz.printResult(5));
    } 

}
