package hashtable;

public class Node<T> {
    protected T key;
    protected T value;
    protected Node next;

    public Node(T key, T value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
