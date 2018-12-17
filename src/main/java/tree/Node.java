package tree;

public class Node {
    public int value;
    protected Node left;
    protected Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node leftChild() {
        return this.left;
    }

    public Node rightChild() {
        return this.right;
    }
}
