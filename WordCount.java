package exercise4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> countUniqueWords(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
        List<String> wordList = Arrays.asList(sentence.split(" "));
        wordCountMap = wordList.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        return wordCountMap;
    }

}
