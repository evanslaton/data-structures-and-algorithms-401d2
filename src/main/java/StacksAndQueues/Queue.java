package StacksAndQueues;

public class Queue<T> {
    // Instance properties
    protected Node<T> front;
    protected Node<T> rear;

    // Constructor
    Queue() {
        this.front = null;
        this.rear = null;
    }

    // Adds a new node with the specified value to the back of the queue with an O(1) Time performance
    public void enqueue(T value) {
        Node newNode = new Node(value, null);
        if (this.front == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    // Removes the node from the front of the queue, and returns that node's value
    public T dequeue() {
        if (this.front == null) {
            return null;
        } else {
            T frontNodeValue = this.front.value;
            this.front = this.front.next;
            return frontNodeValue;
        }
    }

    // Returns the value of the node located in the front of the queue
    public T peek() {
        return this.front != null ? this.front.value : null;
    }
}
