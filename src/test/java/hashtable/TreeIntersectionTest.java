package hashtable;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void testTreeIntersection() {
        BinaryTree testBinaryTree1 = new BinaryTree();
        testBinaryTree1.root = new tree.Node(21, null, null);
        testBinaryTree1.root.left = new tree.Node(62, null, null);
        testBinaryTree1.root.right = new tree.Node(4, null, null);
        testBinaryTree1.root.left.right = new tree.Node(5, null, null);
        testBinaryTree1.root.left.right.right = new tree.Node(987654321, null, null);
        testBinaryTree1.root.right.left = new tree.Node(0, null, null);
        testBinaryTree1.root.right.right = new tree.Node(-8, null, null);

        BinaryTree testBinaryTree = new BinaryTree();
        testBinaryTree.root = new tree.Node(210, null, null);
        testBinaryTree.root.left = new tree.Node(62, null, null);
        testBinaryTree.root.right = new tree.Node(49, null, null);
        testBinaryTree.root.left.right = new tree.Node(500, null, null);
        testBinaryTree.root.left.right.right = new tree.Node(987654321, null, null);
        testBinaryTree.root.right.left = new tree.Node(0, null, null);
        testBinaryTree.root.right.right = new Node(-8, null, null);

        Set<Object> s = new HashSet<>();
        TreeIntersection t = new TreeIntersection();
        s = t.treeIntersection(testBinaryTree, testBinaryTree1);
        assertEquals(4, s.size());
        assertTrue(s.contains(-8));
        assertTrue(s.contains(0));
        assertTrue(s.contains(987654321));
        assertTrue(s.contains(62));
        assertFalse(s.contains(210));
        assertFalse(s.contains(49));
    }
}