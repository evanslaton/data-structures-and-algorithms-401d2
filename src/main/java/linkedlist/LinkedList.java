package linkedlist;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(15);
        ll.insert(20);
        ll.insert(25);

        ll.print();
    }

    private Node head;

    // Constructor
    LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }

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

    public void print() {
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

}
