package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testAdd() {
        BinarySearchTree testTree = new BinarySearchTree();
        assertTrue("Should be the same", testTree.root == null);

        testTree.add(123);
        testTree.add(50);
        testTree.add(49);
        testTree.add(125);

        assertTrue("Should be the same", (int) testTree.root.value == 123);
        assertTrue("Should be the same", (int) testTree.root.left.value == 50);
        assertTrue("Should be the same", (int) testTree.root.left.left.value == 49);
        assertTrue("Should be the same", (int) testTree.root.right.value == 125);
    }

    @Test
    public void testContains() {
        BinarySearchTree testTree = new BinarySearchTree();
        assertTrue("Should be the same", testTree.root == null);

        testTree.add(123);
        testTree.add(987);
        testTree.add(765);
        testTree.add(3214);
        testTree.add(1);

        assertTrue("Should be true", testTree.contains(123));
        assertTrue("Should be true", testTree.contains(1));
        assertTrue("Should be true", testTree.contains(987));
        assertTrue("Should be true", testTree.contains(3214));
        assertFalse("Should be false", testTree.contains(100101011));
        assertFalse("Should be false", testTree.contains(21));
        assertFalse("Should be false", testTree.contains(-7));
    }
}