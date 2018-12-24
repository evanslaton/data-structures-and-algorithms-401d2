package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testPreOrder() {
        BinaryTree testBinaryTree = new BinaryTree();
        assertTrue("Should inform the user the tree is empty and return null", testBinaryTree.preOrder() == null);

        //  testBinaryTree
        //         10
        //        /   \
        //       7     100
        //     /  \   /
        //   3   18  5

        testBinaryTree.root = new Node(10, null, null);
        testBinaryTree.root.left = new Node(7, null, null);
        testBinaryTree.root.right = new Node(100, null, null);
        testBinaryTree.root.left.left = new Node(3, null, null);
        testBinaryTree.root.left.right = new Node(18, null, null);
        testBinaryTree.root.right.left = new Node (5, null, null);
        Object[] testResults = testBinaryTree.preOrder();

        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(7);
        testList.add(3);
        testList.add(18);
        testList.add(100);
        testList.add(5);
        for (int i = 0; i < testList.size(); i++) {
            assertEquals("Should be equal", testList.get(i), testResults[i]);
        }

        testBinaryTree.root.value = 9;
        testList.set(0, 9);
        testResults = testBinaryTree.preOrder();
        for (int i = 0; i < testList.size(); i++) {
            assertEquals("Should be equal", testList.get(i), testResults[i]);
        }
    }

    @Test
    public void testInOrder() {
        BinaryTree testBinaryTree = new BinaryTree();
        assertTrue("Should inform the user the tree is empty and return null", testBinaryTree.inOrder() == null);

        //  testBinaryTree
        //         21
        //        /   \
        //      62     4
        //       \    / \
        //        5  0  -8
        //         \
        //     987654321

        testBinaryTree.root = new Node(21, null, null);
        testBinaryTree.root.left = new Node(62, null, null);
        testBinaryTree.root.right = new Node(4, null, null);
        testBinaryTree.root.left.right = new Node(5, null, null);
        testBinaryTree.root.left.right.right = new Node(987654321, null, null);
        testBinaryTree.root.right.left = new Node (0, null, null);
        testBinaryTree.root.right.right = new Node (-8, null, null);
        Object[] testResults = testBinaryTree.inOrder();

        List<Integer> testList = new ArrayList<>();
        testList.add(62);
        testList.add(5);
        testList.add(987654321);
        testList.add(21);
        testList.add(0);
        testList.add(4);
        testList.add(-8);
        for (int i = 0; i < testList.size(); i++) {
            assertEquals("Should be equal", testList.get(i), testResults[i]);
        }

        testBinaryTree.root.value = 88;
        testList.set(3, 88);
        testResults = testBinaryTree.inOrder();
        for (int i = 0; i < testList.size(); i++) {
            assertEquals("Should be equal", testList.get(i), testResults[i]);
        }
    }

    @Test
    public void testPostOrder() {
        BinaryTree testBinaryTree = new BinaryTree();
        assertTrue("Should inform the user the tree is empty and return null", testBinaryTree.postOrder() == null);

        //  testBinaryTree
        //         -21
        //        /   \
        //       99   496
        //            / \
        //           32  3

        testBinaryTree.root = new Node(-21, null, null);
        testBinaryTree.root.left = new Node(99, null, null);
        testBinaryTree.root.right = new Node(496, null, null);
        testBinaryTree.root.right.left = new Node (32, null, null);
        testBinaryTree.root.right.right = new Node (3, null, null);
        Object[] testResults = testBinaryTree.postOrder();

        List<Integer> testList = new ArrayList<>();
        testList.add(99);
        testList.add(32);
        testList.add(3);
        testList.add(496);
        testList.add(-21);
        for (int i = 0; i < testList.size(); i++) {
            assertEquals("Should be equal", testList.get(i), testResults[i]);
        }

        testBinaryTree.root.value = 7;
        testList.set(4, 7);
        testResults = testBinaryTree.postOrder();
        for (int i = 0; i < testList.size(); i++) {
            assertEquals("Should be equal", testList.get(i), testResults[i]);
        }
    }
}