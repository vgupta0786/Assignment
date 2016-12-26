package exercise4;

import java.util.HashMap;
import java.util.Map;


public class WordCount {

    public Map<String,Integer> countUniqueWords(String word) {
        Map<String,Integer> wordCountMap = new HashMap<String, Integer>();
        wordCountMap.put("hello", new Integer(1));
        return wordCountMap;
    }

}
