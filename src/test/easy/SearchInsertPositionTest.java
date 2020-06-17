package test.easy;

import easy.SearchInsertPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    private SearchInsertPosition obj;
    @BeforeEach
    void setUp() {
        obj = new SearchInsertPosition();
    }

    @Test
    void searchInsert() {
        assertEquals(obj.searchInsert(new int[]{1,3,5,6}, 5), 2);
        assertEquals(obj.searchInsert(new int[]{1,3,5,6}, 2), 1);
        assertEquals(obj.searchInsert(new int[]{1,3,5,6}, 7), 4);
        assertEquals(obj.searchInsert(new int[]{1,3,5,6}, 0), 0);
    }
}