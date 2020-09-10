package test.easy;

import easy.MergeTwoSortedLists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private MergeTwoSortedLists obj;
    @BeforeEach
    void setUp() {
        obj = new MergeTwoSortedLists();
    }

    @Test
    void mergeTwoSortedLists() {
        //result: [1 ,1, 3, 5]
        System.out.println(obj.mergeTwoSortedLists(obj.getObj(1, obj.getObj(3, null)), obj.getObj(1, obj.getObj(5, null))));
    }
}