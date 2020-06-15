package test.easy;

import easy.LongestCommonPrefix;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private LongestCommonPrefix obj;

    @BeforeEach
    void setUp() {
        obj =  new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {
        assertEquals(obj.longestCommonPrefix(new String[]{"flower","flow","flight"}), "fl");
        assertEquals(obj.longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
        assertEquals(obj.longestCommonPrefix(new String[]{}), "");
    }
}