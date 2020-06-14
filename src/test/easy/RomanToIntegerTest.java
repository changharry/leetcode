package test.easy;

import easy.RomanToInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private RomanToInteger obj;

    @BeforeEach
    void setUp() {
       obj = new RomanToInteger();
    }

    @Test
    void romanToInt() {
        assertEquals(obj.romanToInt("III"), 3);
        assertEquals(obj.romanToInt("IV"), 4);
        assertEquals(obj.romanToInt("IX"), 9);
        assertEquals(obj.romanToInt("LVIII"), 58);
        assertEquals(obj.romanToInt("MCMXCIV"), 1994);
    }
}