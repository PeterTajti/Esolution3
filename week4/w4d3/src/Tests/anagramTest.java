package Tests;

import Tasks.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class anagramTest {

    //kreálunk egy Anagram class-ú anagramot

    Anagram myAnagram = new Anagram();

    @Test

    public void test1 () {
        assertTrue(myAnagram.myAnagramFunction("torok", "kotor")); //true-ra assertTrue-t használunk
    }

    @Test

    public void test2 () {
        assertFalse(myAnagram.myAnagramFunction("torok", "torokgyulladas")); //false-ra assertFalse-t használunk
    }
}
