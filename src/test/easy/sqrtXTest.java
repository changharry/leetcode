package test.easy;

import easy.sqrtX;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sqrtXTest {

    private sqrtX obj;

    @BeforeEach
    void setUp() {
        obj = new sqrtX();
    }

    @Test
    void mySqrt() {
        assertEquals(obj.mySqrt(9), 3);
        assertEquals(obj.mySqrt(8), 2);
    }
}