package tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OtherBinaryTreeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void breadthFirst1() {
        OtherBinaryTree testOtherBinaryTree = new OtherBinaryTree();
        testOtherBinaryTree.root = new Node("A", null, null);
            testOtherBinaryTree.root.left = new Node(99, null, null);
                testOtherBinaryTree.root.left.left = new Node(true, null, null);
                testOtherBinaryTree.root.left.right = new Node(9.8, null, null);
            testOtherBinaryTree.root.right = new Node(496, null, null);
                testOtherBinaryTree.root.right.left = new Node (32, null, null);
                testOtherBinaryTree.root.right.right = new Node (3, null, null);

        OtherBinaryTree.breadthFirst(testOtherBinaryTree);
        assertEquals("A 99 496 true 9.8 32 3 ", outContent.toString());
    }

    @Test
    public void breadthFirst2() {
        OtherBinaryTree testOtherBinaryTree = new OtherBinaryTree();
        testOtherBinaryTree.root = new Node(-55, null, null);
            testOtherBinaryTree.root.left = new Node(3.33333333333, null, null);
                testOtherBinaryTree.root.left.left = new Node(0, null, null);
                testOtherBinaryTree.root.left.right = new Node(9.8, null, null);
                    testOtherBinaryTree.root.left.left.left = new Node('E', null, null);
                    testOtherBinaryTree.root.left.left.right = new Node("This is a string!", null, null);
            testOtherBinaryTree.root.right = new Node(false, null, null);
                testOtherBinaryTree.root.right.left = new Node (":-)", null, null);
                testOtherBinaryTree.root.right.right = new Node (3, null, null);

        OtherBinaryTree.breadthFirst(testOtherBinaryTree);
        assertEquals("-55 3.33333333333 false 0 9.8 :-) 3 E This is a string! ", outContent.toString());
    }

    @Test
    public void breadthFirst3() {
        OtherBinaryTree testOtherBinaryTree = new OtherBinaryTree();
        testOtherBinaryTree.root = new Node('b', null, null);
            testOtherBinaryTree.root.left = new Node(false, null, null);
                testOtherBinaryTree.root.left.left = new Node(true, null, null);
                testOtherBinaryTree.root.left.right = new Node("TEST", null, null);
                    testOtherBinaryTree.root.left.left.left = new Node(9, null, null);
            testOtherBinaryTree.root.right = new Node("FizzBuzz", null, null);
                testOtherBinaryTree.root.right.left = new Node (":-(", null, null);
                testOtherBinaryTree.root.right.right = new Node (1, null, null);
                    testOtherBinaryTree.root.right.right.right = new Node(.2, null, null);

        OtherBinaryTree.breadthFirst(testOtherBinaryTree);
        assertEquals("b false FizzBuzz true TEST :-( 1 9 0.2 ", outContent.toString());
    }
}