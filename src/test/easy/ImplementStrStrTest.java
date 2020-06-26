package test.easy;

import easy.ImplementStrStr;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    private ImplementStrStr obj;

    @BeforeEach
    void setUp() {
        obj = new ImplementStrStr();
    }

    @Test
    void strStr() {
        assertEquals(obj.strStr("hello", "ll"), 2);
        assertEquals(obj.strStr("aaaaa", "bba"), -1);
    }
}