package test.easy;

import easy.TwoSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum obj;

    @BeforeEach
    void setUp() {
        obj = new TwoSum();
    }

    @Test
    void twoSum() {
        assertArrayEquals(obj.twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
    }
}