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

}
