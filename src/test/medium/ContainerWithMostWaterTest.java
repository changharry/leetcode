package test.medium;

import meidum.ContainerWithMostWater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater obj;
    @BeforeEach
    void setUp() {
        obj = new ContainerWithMostWater();
    }

    @Test
    void maxArea() {
        assertEquals(obj.maxArea(new int[]{1,8,6,2,5,4,8,3,7}), 49);
    }
}