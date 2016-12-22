package exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vgup77
 *
 */
public class FizzBuzzStreams {

    /**
     * to print stream in required format
     * 
     * @param limit
     */
    public List<String> printResult(int limit) {
        List<String> stream = new ArrayList<String>();
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0) {
                stream.add("Fizz");
            } else {
                stream.add(String.valueOf(i));
            }
        }
        return stream;

    }

}
