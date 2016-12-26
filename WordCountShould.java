package exercise4;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountShould {

    @Test
    public void print_single_word_and_its_count_in_a_collection() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
        wordCountMap.put("hello", new Integer(1));
        assertEquals(wordCountMap, wordCount.countUniqueWords("hello"));
    }

    @Test
    public void print_two_when_same_words_delimited_with_space_are_passed() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> wordCountMap = wordCount.countUniqueWords("hello hello");
        assertEquals(new Integer(2), wordCountMap.get("hello"));
    }

    @Test
    public void print_two_diff_words_and_count() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> wordCountMap = wordCount.countUniqueWords("hi hello");
        assertEquals(new Integer(1), wordCountMap.get("hello"));
    }
    
    @Test
    public void print_two_same_and_one_diff_word_and_their_count() {
        WordCount wordCount = new WordCount();
        Map<String,Integer> wordCountMap=wordCount.countUniqueWords("hi hello hello");
        assertEquals(new Integer(2), wordCountMap.get("hello"));
        assertEquals(new Integer(1), wordCountMap.get("hi"));
    }
    
    @Test
    public void print_three_diff_words_with_2_dilimiters() {
        WordCount wordCount = new WordCount();
        Map<String,Integer> wordCountMap=wordCount.countUniqueWords("hi how&hello"," &");
        assertEquals(new Integer(1), wordCountMap.get("hello"));
	assertEquals(new Integer(1), wordCountMap.get("how"));
	assertEquals(new Integer(1), wordCountMap.get("hi"));
    }
}
