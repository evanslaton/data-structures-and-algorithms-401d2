package StacksAndQueues;

public class Node<T> {
    protected T value;
    protected Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }
}
