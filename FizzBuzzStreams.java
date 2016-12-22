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
     * @param limit number of elements in the list
     */
    public List<String> printResult(int limit) {
        List<String> stream = new ArrayList<String>();
        for (int pos = 1; pos <= limit; pos++) {
            stream.add(nextElement(pos));
        }
        return stream;
    }

    /**
     * to retrieve next element for adding to the stream
     * 
     * @param position
     * @return
     */
    public String nextElement(int position) {
        String result = "";
        if (position % 3 == 0) {
            result += "Fizz";
        }
        if (position % 5 == 0) {
            result += "Buzz";
        }
        return result.length() > 0 ? result : Integer.toString(position);
    }

}
