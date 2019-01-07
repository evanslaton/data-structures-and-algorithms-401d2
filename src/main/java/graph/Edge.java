package graph;

public class Edge {
    // Instance Variables
    protected Node start;
    protected Node end;
    protected Comparable weight;

    // Constructor
    public Edge(Node start, Node end, Comparable weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }
}
