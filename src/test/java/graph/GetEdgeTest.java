package graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void testGetEdge() {
        Graph testGraph = new Graph();
        Node cincinnati = testGraph.addNode("Cincinnati");
        Node columbus = testGraph.addNode("Columbus");
        Node cleveland = testGraph.addNode("Cleveland");
        Node toledo = testGraph.addNode("Toledo");
        Node dayton = testGraph.addNode("Dayton");

        // Add edges
        // Cincinnati -> Columbus, Dayton
        // Dayton -> Cincinnati
        // Columbus -> Cleveland, Toledo, Cincinnati
        // Toledo -> Columbus, Cleveland
        // Cleveland -> Columbus, Toledo
        testGraph.addEdge(cincinnati, columbus, 25);
        testGraph.addEdge(cincinnati, dayton, 15);
        testGraph.addEdge(columbus, cleveland, 25);
        testGraph.addEdge(columbus, toledo, 15);
        testGraph.addEdge(cleveland, toledo, 15);

        String[] testArray1 = {"Cincinnati", "Columbus", "Cleveland"}; // True, $50
        String[] testArray2 = {"Dayton", "Cincinnati", "Columbus", "Cleveland", "Toledo"}; // True, $80
        String[] testArray3 = {"Columbus", "Dayton"}; // False, $0
        String[] testArray4 = {"Cleveland", "Toledo", "Cincinnati"}; // False, $0
        String[] testArray5 = {""}; // False, $0
        String[] testArray6 = {}; // False, $0

        assertEquals("", "True, $50", GetEdge.getEdge(testGraph, testArray1));
        assertEquals("", "True, $80", GetEdge.getEdge(testGraph, testArray2));
        assertEquals("", "False, $0", GetEdge.getEdge(testGraph, testArray3));
        assertEquals("", "False, $0", GetEdge.getEdge(testGraph, testArray4));
        assertEquals("", "False, $0", GetEdge.getEdge(testGraph, testArray5));
        assertEquals("", "False, $0", GetEdge.getEdge(testGraph, testArray6));
    }
}