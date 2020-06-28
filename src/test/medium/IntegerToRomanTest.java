package test.medium;

import meidum.IntegerToRoman;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    private IntegerToRoman obj;

    @BeforeEach
    void setUp() {
        obj = new IntegerToRoman();
    }

    @Test
    void intToRoman() {
        assertEquals(obj.intToRoman(3), "III");
        assertEquals(obj.intToRoman(4), "IV");
        assertEquals(obj.intToRoman(9), "IX");
        assertEquals(obj.intToRoman(58), "LVIII");
        assertEquals(obj.intToRoman(1994), "MCMXCIV");
    }
}