package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Graph<T> {
    // Instance Variables
    protected HashSet<Node> vertices;

    // Constructor
    public Graph() {
        this.vertices = new HashSet<>();
    }

    // Creates a new node, adds it to the Graph's vertices HashSet and returns the new node
    public Node addNode(T value) {
        Node newNode = new Node(value);
        vertices.add(newNode);
        return newNode;
    }

    // Creates a new edge between the inputted nodes and adds the edge to each node's neighbors HashSet
    public void addEdge(Node nodeOne, Node nodeTwo, Comparable weight) {
        Edge edgeOne = new Edge(nodeOne, nodeTwo, weight);
        Edge edgeTwo = new Edge(nodeTwo, nodeOne, weight);
        nodeOne.neighbors.add(edgeOne);
        nodeTwo.neighbors.add(edgeTwo);
    }

    // Returns all of the nodes in the graph as a set
    public HashSet<Node> getNodes() {
        return vertices;
    }

    // Returns the inputted nodes neighbors
    public HashSet<Node> getNeighbors(Node node) {
        // Makes sure this class knows that node.neighbors is a HashSet of Edges and not Objects because Java
        HashSet<Edge> neighborsToIterateOver = node.neighbors;
        HashSet<Node> neighbors = new HashSet<>();
        for (Edge edge : neighborsToIterateOver) {
            neighbors.add(edge.end);
        }
        return neighbors;
    }

    // Returns the total number of nodes in the graph
    public int size() {
        return vertices.size();
    }

    // Returns a list of nodes connected to the inputted node in breadth first order
    public List<Node> breadthFirstTraversal(Node node) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(node);
//        for (Node n : nodes) {
        for (int i = 0; i < nodes.size(); i++) {
            HashSet<Edge> nodesNeighbors = nodes.get(i).neighbors;
            for (Edge m: nodesNeighbors) {
                if (!nodes.contains(m.end)) {
                    nodes.add(m.end);
                }
            }
        }
        return nodes;
    }
}
