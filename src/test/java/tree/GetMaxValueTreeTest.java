package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetMaxValueTreeTest {

    @Test
    public void testFindMaximumValue() {
        GetMaxValueTree testGetMaxValueTree = new GetMaxValueTree();
        assertEquals(null, GetMaxValueTree.findMaximumValue(testGetMaxValueTree));

        testGetMaxValueTree.root =
                new Node(1,
                        new Node(7,
                                new Node(30, null, null),
                                null),
                        new Node(10,
                                new Node(20, null, null),
                                new Node (5, null, null)));
        assertEquals(30, (int)GetMaxValueTree.findMaximumValue(testGetMaxValueTree));

        testGetMaxValueTree.root.value = 1000;
        assertEquals(1000, (int)GetMaxValueTree.findMaximumValue(testGetMaxValueTree));
    }
}