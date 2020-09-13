package test.easy;

import easy.PlusOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private PlusOne obj;

    @BeforeEach
    void setUp() {
        obj = new PlusOne();
    }

    @Test
    void plusOne() {
        assertArrayEquals(obj.plusOne(new int[]{9, 9 ,9}), new int[]{1, 0, 0, 0});
        assertArrayEquals(obj.plusOne(new int[]{1, 2 ,3}), new int[]{1, 2, 4});
        assertArrayEquals(obj.plusOne(new int[]{4, 3 ,2, 1}), new int[]{4, 3, 2, 2});
        assertArrayEquals(obj.plusOne(new int[]{0}), new int[]{1});
    }
}