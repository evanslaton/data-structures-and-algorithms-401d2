package StacksAndQueues;

public class Stack {
    protected Node top;

    Stack() {
        this.top = null;
    }

    //   Adds a new node with the specified value to the top of the stack with an O(1) Time performance.
    public void push(int value) {
        Node newNode = new Node(value, this.top);
        this.top = newNode;
    }

    // Removes the node from the top of the stack, and returns the node.
    public Node pop() {
        Node topNode = this.top;
        this.top = this.top.next;
        return topNode;
    }

    // Returns the node located on the top of the stack.
    public Node peek() {
        return this.top;
    }
}
