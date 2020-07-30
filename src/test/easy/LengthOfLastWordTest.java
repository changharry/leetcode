package test.easy;

import easy.LengthOfLastWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    private LengthOfLastWord obj;

    @BeforeEach
    void setUp() {
        obj = new LengthOfLastWord();
    }

    @Test
    void lengthOfLastWord() {
        assertEquals(obj.lengthOfLastWord("Hello World"), 5);
        assertEquals(obj.lengthOfLastWord("        "), 0);
    }
}