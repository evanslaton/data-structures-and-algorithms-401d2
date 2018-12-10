package StacksAndQueues;

public class Node<T> {
    public T value;
    public Node next;

    Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }
}
