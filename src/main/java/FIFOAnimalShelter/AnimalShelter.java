package FIFOAnimalShelter;

import StacksAndQueues.Node;

public class AnimalShelter<T> {
        // Instance properties
    protected Node<T> front;
    protected Node<T> rear;

    // Constructor
    public AnimalShelter() {
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
    public Object dequeue(String animalType) {
        Node previous = this.front;
        Node current = this.front;
        while (current != null) {
            if (current.value.toString() == animalType) {
                // Points front and rear to null if nothing else is in the queue
                if (current == previous && current.next == null) {
                    this.front = null;
                    this.rear = null;
                // Points front to the next node if the first node is being removed
                } else if (current == previous && current.next != null) {
                    this.front = this.front.next;
                // Points rear to the previous node if the last node is being removed
                } else if (current == this.rear) {
                    this.rear = previous;
                }
                if (current != previous) {
                    previous.next = previous.next.next;
                }
                return current.value;
            }
            // Keeps previous one node behind current
            if (previous != current) {
                previous = previous.next;
            }
            current = current.next;
        }
        return null;
    }

    // Returns the value of the node located in the front of the queue
    public T peek() {
        return this.front != null ? this.front.value : null;
    }
}
