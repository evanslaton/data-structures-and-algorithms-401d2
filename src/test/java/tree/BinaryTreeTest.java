package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testPreOrder() {
        BinaryTree testBinaryTree = new BinaryTree();
        assertEquals("Should inform the user the tree is empty and return null", null, testBinaryTree.preOrder(testBinaryTree.root));

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

        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(7);
        testList.add(3);
        testList.add(18);
        testList.add(100);
        testList.add(5);

        assertEquals("Should be [10, 7, 3, 18, 100, 5]", testList, testBinaryTree.preOrder(testBinaryTree.root));
    }

//    @Test
//    public void testInOrder() {
//        BinaryTree testBinaryTree = new BinaryTree();
//        assertEquals("Should inform the user the tree is empty and return null", null, testBinaryTree.inOrder());
//
//        //  testBinaryTree
//        //         21
//        //        /   \
//        //      62     4
//        //       \    / \
//        //        5  0  -8
//        //         \
//        //     987654321
//
//        testBinaryTree.root = new Node(21, null, null);
//        testBinaryTree.root.left = new Node(62, null, null);
//        testBinaryTree.root.right = new Node(4, null, null);
//        testBinaryTree.root.left.right = new Node(5, null, null);
//        testBinaryTree.root.left.right.right = new Node(987654321, null, null);
//        testBinaryTree.root.right.left = new Node (0, null, null);
//        testBinaryTree.root.right.right = new Node (-8, null, null);
//
//        List<Integer> testList = new ArrayList<>();
//        testList.add(62);
//        testList.add(5);
//        testList.add(987654321);
//        testList.add(21);
//        testList.add(0);
//        testList.add(4);
//        testList.add(-8);
//
//        assertEquals("Should be [62, 5, 987654321, 21, 0, 4, -8]", testList, testBinaryTree.inOrder());
//    }
//
//    @Test
//    public void testPostOrder() {
//        BinaryTree testBinaryTree = new BinaryTree();
//        assertEquals("Should inform the user the tree is empty and return null", null, testBinaryTree.postOrder());
//
//
//        //  testBinaryTree
//        //         -21
//        //        /   \
//        //       99   496
//        //            / \
//        //           32  3
//
//        testBinaryTree.root = new Node(-21, null, null);
//        testBinaryTree.root.left = new Node(99, null, null);
//        testBinaryTree.root.right = new Node(496, null, null);
//        testBinaryTree.root.right.left = new Node (32, null, null);
//        testBinaryTree.root.right.right = new Node (3, null, null);
//
//        List<Integer> testList = new ArrayList<>();
//        testList.add(99);
//        testList.add(32);
//        testList.add(3);
//        testList.add(496);
//        testList.add(-21);
//
//        assertEquals("Should be [99, 32, 3, 496, -21]", testList, testBinaryTree.postOrder());
//    }
}