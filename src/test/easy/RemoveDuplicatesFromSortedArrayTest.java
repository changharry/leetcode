package test.easy;

import easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray obj;

    @BeforeEach
    void setUp() {
        obj = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void removeDuplicates() {
        assertEquals(obj.removeDuplicates(new int[]{1,1,2}), 2);
        assertEquals(obj.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}), 5);
    }
}