package test.easy;

import easy.ValidParentheses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses obj;

    @BeforeEach
    void setUp() {
        obj = new ValidParentheses();
    }

    @Test
    void isValid() {
        assertTrue(obj.isValid("()"));
        assertTrue(obj.isValid(""));
        assertFalse(obj.isValid(")"));
        assertFalse(obj.isValid("(]"));
        assertFalse(obj.isValid("([)]"));
        assertTrue(obj.isValid("{[]}"));
    }
}