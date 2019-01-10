package graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class DepthFirstTest {

    @Test
    public void testDepthFirstPreOrder() {
        // Create graph and nodes
        Graph graph = new Graph();
        Node nodeA = graph.addNode("A");
        Node nodeE = graph.addNode("E");
        Node nodeF = graph.addNode("F");
        Node nodeB = graph.addNode("B");
        Node nodeC = graph.addNode("C");
        Node nodeG = graph.addNode("G");
        Node nodeZ = graph.addNode("Z");

        // Add edges
        graph.addEdge(nodeA, nodeE, 1);
            graph.addEdge(nodeE, nodeF, 1);
        graph.addEdge(nodeA, nodeB, 1);
            graph.addEdge(nodeB, nodeC, 1);
        graph.addEdge(nodeA, nodeG, 1);

        // List of nodes in the order they should be after being depth-first pre-ordered
        List<Node> compareList = new ArrayList<>();
        compareList.add(nodeG);
        compareList.add(nodeA);
        compareList.add(nodeE);
        compareList.add(nodeF);
        compareList.add(nodeB);
        compareList.add(nodeC);
        compareList.add(nodeZ);

        List<Node> answers = DepthFirst.depthFirstPreOrder(graph);

        assertTrue("answers should not be null", answers !=  null);
        assertTrue("Size of answers should be 7", answers.size() == 7);
        int i = 0;
        for (Node n : answers) {
            assertEquals("The nodes in compareList and answers should be in the same order", compareList.get(i), n);
            i++;
        }




    }
}