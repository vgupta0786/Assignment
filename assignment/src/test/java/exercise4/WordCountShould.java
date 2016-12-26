package exercise4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordCountShould {

    @Test
    public void print_one_when_single_word_is_passed() {
        WordCount wordCount = new WordCount();
        assertEquals("1", wordCount.countUniqueWords("hello"));
    }

}
