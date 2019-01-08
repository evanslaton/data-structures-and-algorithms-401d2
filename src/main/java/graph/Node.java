package graph;

import java.util.HashSet;

public class Node<T> {
    // Instance Variables
    protected T value;
    protected HashSet<Edge> neighbors;

    // Constructor
    public Node(T value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    @Override
    public String toString() {
        System.out.println(this.value);
        return this.value.toString();
    }
}
