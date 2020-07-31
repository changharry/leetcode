package test.easy;

import easy.ClimbingStairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private ClimbingStairs obj;

    @BeforeEach
    void setUp() {
        obj = new ClimbingStairs();
    }

    @Test
    void climbStairs() {
        assertEquals(obj.climbStairs(3), 3);
        assertEquals(obj.climbStairs(2), 2);
    }
}