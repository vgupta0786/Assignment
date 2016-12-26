package exercise4;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountShould {

    @Test
    public void print_one_when_single_word_is_passed() {
        WordCount wordCount = new WordCount();
        assertEquals("1", wordCount.countUniqueWords("hello"));
    }
    
    @Test
    public void print_single_word_and_its_count_in_a_collection() {
        WordCount wordCount = new WordCount();
        Map<String,Integer> wordCountMap = new HashMap<String, Integer>();
        wordCountMap.put("hello", new Integer(1));
        assertEquals(wordCountMap, wordCount.countUniqueWords("hello"));
    }

}