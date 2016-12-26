package exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> countUniqueWords(String sentence) {
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
        List<String> wordList = Arrays.asList(sentence.split(" "));
        wordCountMap = wordList.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        return wordCountMap;
    }

    public Map<String, Integer> countUniqueWords(String sentence, String delimiter) {
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
        StringTokenizer words = new StringTokenizer(sentence, delimiter);
        List<String> wordList = new ArrayList<String>();
        while (words.hasMoreTokens())
            wordList.add(words.nextToken());
        wordCountMap = wordList.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        return wordCountMap;
    }

}
