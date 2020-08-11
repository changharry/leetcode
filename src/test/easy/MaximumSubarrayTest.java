package test.easy;

import easy.MaximumSubarray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private MaximumSubarray obj;

    @BeforeEach
    void setUp() {
        obj = new MaximumSubarray();
    }

    @Test
    void maxSubArray() {
        assertEquals(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        assertEquals(obj.maxSubArray(new int[] {0}), 0);
        assertEquals(obj.maxSubArray(new int[]{1}), 1);
        assertEquals(obj.maxSubArray(new int[]{-2, 1}), 1);
    }
}