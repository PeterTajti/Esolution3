package Tests;

import Tasks.CountLetters;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class countLettersTest {

    CountLetters myCounter = new CountLetters();

    @Test

    void characterCounterTest1() {
        HashMap<Character, Integer> dictionary = new HashMap<>();

        dictionary.put('a', 3);
        dictionary.put('l', 1);
        dictionary.put('m', 1);
        dictionary.put('f', 1);

        assertEquals(dictionary, myCounter.characterCounter("almafa"));


    }

}
