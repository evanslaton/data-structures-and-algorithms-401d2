package fizzbuzztree;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
//
//    @Test
//    public void testFizzBuzzTree() {
//        BinaryTree testBinaryTree = new BinaryTree();
//
//        testBinaryTree.root = new Node(5, null, null);
//        testBinaryTree.root.left = new Node(1, null, null);
//        testBinaryTree.root.right = new Node(15, null, null);
//        testBinaryTree.root.right.left = new Node (6, null, null);
//        testBinaryTree.root.right.right = new Node (13, null, null);
//        testBinaryTree.root.right.right.left = new Node (14, null, null);
//
//        List<Object> testListBefore = new ArrayList<>();
//        testListBefore.add("1");
//        testListBefore.add("6");
//        testListBefore.add("14");
//        testListBefore.add("13");
//        testListBefore.add("15");
//        testListBefore.add("5");
//
//        List<Object> testListAfter = new ArrayList<>();
//        testListAfter.add("1");
//        testListAfter.add("Fizz");
//        testListAfter.add("14");
//        testListAfter.add("13");
//        testListAfter.add("FizzBuzz");
//        testListAfter.add("Buzz");
//
//        // Checks the tree's values before running fizzBuzzTree
//        List<Object> before = new ArrayList<>();
//        Node[] valuesBefore = testBinaryTree.postOrder(testBinaryTree.root);
//        for (int i = 0; i < valuesBefore.length; i ++) {
//            before.add(valuesBefore[i].toString());
//        }
//        assertEquals("Should be [1, 6, 14, 13, 15, 5]", testListBefore, before);
//
//        FizzBuzzTree.fizzBuzzTree(testBinaryTree);
//
//        // Checks the tree's values after running fizzBuzzTree
//        List<Object> after = new ArrayList<>();
//        Node[] valuesAfter = testBinaryTree.postOrder(testBinaryTree.root);
//        for (int i = 0; i < valuesBefore.length; i ++) {
//            after.add(valuesBefore[i].toString());
//        }
//        assertEquals("Should be [1, Fizz, 14, 13, FizzBuzz, Buzz]", testListAfter, after);
//
//        // Running the same assert statements with a different tree that includes 0 and negative values
//        BinaryTree testBinaryTree2 = new BinaryTree();
//
//        testBinaryTree2.root = new Node(100, null, null);
//        testBinaryTree2.root.left = new Node(71, null, null);
//        testBinaryTree2.root.right = new Node(0, null, null);
//        testBinaryTree2.root.right.left = new Node (-3, null, null);
//        testBinaryTree2.root.right.right = new Node (-5, null, null);
//        testBinaryTree2.root.right.right.left = new Node (-15, null, null);
//
//        List<Object> testListBefore2 = new ArrayList<>();
//        testListBefore2.add("71");
//        testListBefore2.add("-3");
//        testListBefore2.add("-15");
//        testListBefore2.add("-5");
//        testListBefore2.add("0");
//        testListBefore2.add("100");
//
//        List<Object> testListAfter2 = new ArrayList<>();
//        testListAfter2.add("71");
//        testListAfter2.add("Fizz");
//        testListAfter2.add("FizzBuzz");
//        testListAfter2.add("Buzz");
//        testListAfter2.add("FizzBuzz");
//        testListAfter2.add("Buzz");
//
//        // Checks the tree's values before running fizzBuzzTree
//        List<Object> before2 = new ArrayList<>();
//        Node[] valuesBefore2 = testBinaryTree2.postOrder(testBinaryTree2.root);
//        for (int i = 0; i < valuesBefore2.length; i ++) {
//            before2.add(valuesBefore2[i].toString());
//        }
//        assertEquals("Should be [71, -3, -15, -5, 0, 100]", testListBefore2, before2);
//
//        FizzBuzzTree.fizzBuzzTree(testBinaryTree2);
//
//        // Checks the tree's values after running fizzBuzzTree
//        List<Object> after2 = new ArrayList<>();
//        Node[] valuesAfter2 = testBinaryTree2.postOrder(testBinaryTree2.root);
//        for (int i = 0; i < valuesBefore2.length; i ++) {
//            after2.add(valuesBefore2[i].toString());
//        }
//        assertEquals("Should be [1, Fizz, 14, 13, FizzBuzz, Buzz]", testListAfter2, after2);
//    }
}