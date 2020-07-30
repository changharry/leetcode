package test.easy;

import easy.SameTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    private SameTree obj;

    @BeforeEach
    void setUp() {
        obj = new SameTree();
    }

    @Test
    void isSameTree() {
        assertTrue(obj.isSameTree(new SameTree.TreeNode(1), new SameTree.TreeNode(1)));
        assertFalse(obj.isSameTree(new SameTree.TreeNode(1, new SameTree.TreeNode(1), null), new SameTree.TreeNode(1,null, new SameTree.TreeNode(1))));
        assertFalse(obj.isSameTree(new SameTree.TreeNode(1, new SameTree.TreeNode(1), new SameTree.TreeNode(2)), new SameTree.TreeNode(1,new SameTree.TreeNode(2), new SameTree.TreeNode(1))));
    }
}