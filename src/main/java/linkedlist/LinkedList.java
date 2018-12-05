package linkedlist;

import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insertAfter(1, 100);
        ll.print();
    }

    public Node head;

    // Constructor
    LinkedList() {
        this.head = null;
    }

    // Inserts a new node with the specified value into the beginning of the linkedlist
    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }

    // Determines if a specified value is stored in the linkedlist
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

    // Adds a node with the specified value to the end of the linkedlist
    public void append(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                Node newNode = new Node(value);
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    // Inserts a new node with the newValue before the node with the specified value
    public void insertBefore(int value, int newValue) {
        if (this.head.value == value) {
            this.insert(newValue);
            return;
        } else if (!this.includes(value)) {
            return;
        }

        Node current = this.head;
        while (current != null) {
            if (current.next.value == value) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    // Inserts a new node with the newValue after the node with the specified value
    public void insertAfter(int value, int newValue) {
        if (!this.includes(value)) {
            return;
        }

        Node current = this.head;
        while (current != null) {
            if (current.value == value) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    // Return the node’s value that is k from the end of the linked list, returns -1 if the k is longer than the list
    public int getKFromEnd(int k) {
        Node current = this.head;

        while (current != null) {
            Node kFromEnd = current;
            for (int i = 0; i < k; i++) {
                if (kFromEnd.next == null && i != k - 1) {
                    return -1;
                }
                kFromEnd = kFromEnd.next;
            }
            if (kFromEnd.next == null) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }
}
