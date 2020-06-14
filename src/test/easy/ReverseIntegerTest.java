package test.easy;

import easy.ReverseInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    private ReverseInteger obj;

    @BeforeEach
    void setUp() {
        obj = new ReverseInteger();
    }

    @Test
    void reverse() {
        assertEquals(obj.reverse(123), 321);
        assertEquals(obj.reverse(-123), -321);
        assertEquals(obj.reverse(120), 21);
    }
}