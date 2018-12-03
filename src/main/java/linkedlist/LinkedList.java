package linkedlist;

import java.util.ArrayList;

public class LinkedList {
    public Node head;

    // Constructor
    LinkedList() {
        this.head = null;
    }

    // Inserts a new node with the specified value into the linked list
    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }

    // Determines if a specified value is stored in the linked list
    public boolean includes(int valueToFind) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.value == valueToFind) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Prints all the values in the linked list to the console
    public ArrayList print() {
        ArrayList<Integer> linkedListValues = new ArrayList<Integer>();
        Node currentNode = this.head;
        while (currentNode != null) {
            linkedListValues.add(currentNode.value);
            currentNode = currentNode.next;
        }
        System.out.println("LinkedList Value(s): " + linkedListValues);
        return linkedListValues;
    }
}
