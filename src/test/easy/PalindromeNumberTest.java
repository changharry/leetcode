package test.easy;

import easy.PalindromeNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private PalindromeNumber obj;

    @BeforeEach
    void setUp() {
        obj =  new PalindromeNumber();
    }

    @Test
    void isPalindrome() {
        assertTrue(obj.isPalindrome(121));
        assertFalse(obj.isPalindrome(-121));
        assertFalse(obj.isPalindrome(10));
    }
}