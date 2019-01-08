package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void testAddNode() {
        Graph testGraph = new Graph();
        Node node1 = testGraph.addNode(5);
        Node node2 = testGraph.addNode("blue");
        Node node3 = testGraph.addNode(101);

        assertFalse(testGraph.vertices.isEmpty());
        assertEquals(testGraph.size(), 3);

        // Checks to see if the testGraph contains the added nodes
        assertTrue(testGraph.vertices.contains(node1));
        assertTrue(testGraph.vertices.contains(node2));
        assertTrue(testGraph.vertices.contains(node3));
    }

    @Test
    public void addEdge() {
        Graph testGraph = new Graph();
        Node node1 = testGraph.addNode(90.54);
        Node node2 = testGraph.addNode(250);
        Node node3 = testGraph.addNode("elbow");

        // Add edges
        testGraph.addEdge(node1, node2, 7);
        testGraph.addEdge(node2, node3, 1);
        testGraph.addEdge(node3, node1, 1000);

        // Checks that each node has 2 neighbors
        assertTrue(node1.neighbors.size() == 2);
        assertTrue(node2.neighbors.size() == 2);
        assertTrue(node3.neighbors.size() == 2);
    }

    @Test
    public void getNodes() {
        Graph testGraph = new Graph();
        Node node1 = testGraph.addNode("The quick brown fox jumps over the lazy dog");
        Node node2 = testGraph.addNode(123456789);
        Node node3 = testGraph.addNode(0.4);

        HashSet<Node> vertices = testGraph.getNodes();
        assertTrue(vertices.size() == 3);
        assertTrue(vertices.contains(node1));
        assertTrue(vertices.contains(node2));
        assertTrue(vertices.contains(node3));
    }

    @Test
    public void getNeighbors() {
        Graph testGraph = new Graph();
        Node node1 = testGraph.addNode(0);
        Node node2 = testGraph.addNode("yolo");
        Node node3 = testGraph.addNode(82);

        // Add edges
        testGraph.addEdge(node1, node2, 4);
        testGraph.addEdge(node2, node3, 30);
        testGraph.addEdge(node3, node1, "Elephant");

        // Testing node1
        HashSet<Node> neighborsOfNode1 = testGraph.getNeighbors(node1);
        assertTrue(neighborsOfNode1.size() == 2);
        assertTrue(neighborsOfNode1.contains(node2));
        assertTrue(neighborsOfNode1.contains(node3));

        // Testing node2
        HashSet<Node> neighborsOfNode2 = testGraph.getNeighbors(node2);
        assertTrue(neighborsOfNode2.size() == 2);
        assertTrue(neighborsOfNode2.contains(node1));
        assertTrue(neighborsOfNode2.contains(node3));

        // Testing node3
        HashSet<Node> neighborsOfNode3 = testGraph.getNeighbors(node3);
        assertTrue(neighborsOfNode1.size() == 2);
        assertTrue(neighborsOfNode3.contains(node1));
        assertTrue(neighborsOfNode3.contains(node2));
    }

    @Test
    public void testSize() {
        Graph testGraph = new Graph();
        assertTrue(testGraph.vertices.isEmpty());

        testGraph.addNode("New Nodes Are Fun");
        assertEquals(testGraph.size(), 1);

        testGraph.addNode("apple");
        assertEquals(testGraph.size(), 2);

        testGraph.addNode(3);
        assertEquals(testGraph.size(), 3);
    }

    @Test
    public void testBreadthFirstTraversal() {
        Graph testGraph = new Graph();
        Node node1 = testGraph.addNode(10);
        Node node2 = testGraph.addNode(211);
        Node node3 = testGraph.addNode("The Office");

        // Add edges
        testGraph.addEdge(node1, node2, "A");
        testGraph.addEdge(node2, node3, 7);
        testGraph.addEdge(node3, node1, 2.0);

        List<Node> list1 = testGraph.breadthFirstTraversal(node1);
        List<Node> list2 = new ArrayList<>();
        list2.add(node1);
        list2.add(node3);
        list2.add(node2);
        for (int i = 0; i < list2.size(); i++) {
            assertTrue(list1.get(i) == list2.get(i));
        }

        List<Node> list3 = testGraph.breadthFirstTraversal(node2);
        List<Node> list4 = new ArrayList<>();
        list4.add(node2);
        list4.add(node1);
        list4.add(node3);
        for (int i = 0; i < list3.size(); i++) {
            assertTrue(list3.get(i) == list4.get(i));
        }

        List<Node> list5 = testGraph.breadthFirstTraversal(node3);
        List<Node> list6 = new ArrayList<>();
        list6.add(node3);
        list6.add(node1);
        list6.add(node2);
        for (int i = 0; i < list5.size(); i++) {
            assertTrue(list5.get(i) == list6.get(i));
        }
    }
}