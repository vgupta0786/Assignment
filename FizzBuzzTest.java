package exercise3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author vgup77
 *
 */
public class FizzBuzzTest {
    
    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private FizzBuzz fizzBuzz;

    /**
     * instantiations
     */
    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        fizzBuzz = new FizzBuzz();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    /**
     * for cleanup
     */
    @After
    public void cleanUpStreams() {
        outContent = null;
        errContent = null;
        fizzBuzz = null;
        System.setOut(null);
        System.setErr(null);
    }
    
    /**
     * test for least possible value
     */
    @Test
    public void When1IsPassedItShouldPrint1(){
        fizzBuzz.printResult(1);
        assertEquals("1",outContent.toString());
    }
    
    /**
     * test if 3 is passed it should print Fizz
     */
    @Test
    public void When3IsPassedItShouldPrintFizz(){
        fizzBuzz.printResult(3);
        assertEquals("Fizz",outContent.toString());
    }
    
    /**
     * test if 5 is passed it should print buzz
     */
    @Test
    public void When5IsPassedItShouldPrintBuzz(){
        fizzBuzz.printResult(5);
        assertEquals("Buzz",outContent.toString());
    }
    
    /**
     * test when multiple of 3 is passed it should print fizz
     */
    @Test
    public void WhenMultipleOf3IsPassedItShouldPrintFizz(){
        fizzBuzz.printResult(6);
        assertEquals("Fizz",outContent.toString());
    }
    
    /**
     * test when multiple of 5 is passed it should print Buzz
     */
    @Test
    public void WhenMultipleOf5IsPassedItShouldPrintBuzz(){
        fizzBuzz.printResult(10);
        assertEquals("Buzz",outContent.toString());
    }
    
    /**
     * test when multiple of 3 and 5 are passed it should print FizzBuzz
     */
    @Test
    public void WhenMultipleOf3And5ArePassedItShouldPrintFizzBuzz(){
        fizzBuzz.printResult(30);
        assertEquals("FizzBuzz",outContent.toString());
    }
}
