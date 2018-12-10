package StacksAndQueues;

public class Stack<T> {
    // Instance properties
    protected Node<T> top;

    // Constructor
    Stack() {
        this.top = null;
    }

    // Adds a new node with the specified value to the top of the stack with an O(1) Time performance
    public void push(T value) {
        Node newNode = new Node(value, this.top);
        this.top = newNode;
    }

    // Removes the node from the top of the stack, and returns that node's value
    public T pop() {
        T topNodeValue = this.top.value;
        this.top = this.top.next;
        return topNodeValue;
    }

    // Returns the value of the node located on the top of the stack
    public T peek() {
        return this.top != null ? this.top.value : null;
    }
}
