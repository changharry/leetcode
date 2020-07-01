package test.easy;

import easy.RemoveElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    private RemoveElement obj;

    @BeforeEach
    void setUp() {
        obj =  new RemoveElement();
    }

    @Test
    void removeElement() {
        assertEquals(obj.removeElement(new int[]{3,2,2,3}, 3), 2);
        assertEquals(obj.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2), 5);
        assertEquals(obj.removeElement(new int[]{0,1,2,2,3,0,4,2}, 0), 6);
    }
}