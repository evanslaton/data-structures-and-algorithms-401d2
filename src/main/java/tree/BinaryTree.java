package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
<<<<<<< HEAD
    Node<T> root;
=======
    public static void main(String[] args) {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(-21, null, null);
        testBinaryTree.root.left = new Node(99, null, null);
        testBinaryTree.root.right = new Node(496, null, null);
        testBinaryTree.root.right.left = new Node (32, null, null);
        testBinaryTree.root.right.right = new Node (3, null, null);

        Node[] values = testBinaryTree.postOrder(testBinaryTree.root);

//        System.out.println(Arrays.toString(values));
    }

    public Node<T> root;
>>>>>>> master

    // Constructor
    public BinaryTree() {
        this.root = null;
    }

    // Takes in the root node of a tree and returns an array containing the tree's nodes in pre-order
    public Object[] preOrder() {
        if (root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<T> values = new ArrayList<>();
            this.preOrderHelper(this.root, values);
            Object[] valuesArray = new Object[values.size()];
            valuesArray = values.toArray(valuesArray);
            return valuesArray;
        }
    }

    // Recursive helper function for preOrder
    protected void preOrderHelper(Node node, List<T> values) {
        values.add((T) node.value);
        if (node.left != null) {
            this.preOrderHelper(node.left, values);
        }
        if (node.right != null) {
            this.preOrderHelper(node.right, values);
        }
    }

    // Takes in the root node of a tree and returns an array containing the tree's nodes in order
    public Object[] inOrder() {
        if (root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
<<<<<<< HEAD
            List<T> values = new ArrayList<>();
            this.inOrderHelper(this.root, values);
            Object[] valuesArray = new Object[values.size()];
            valuesArray = values.toArray(valuesArray);
            return valuesArray;
=======
            List<Node> nodes = new ArrayList<>();
            this.inOrderHelper(this.root, nodes);
            System.out.println(nodes);
            Node[] nodeArray = new Node[nodes.size()];
            nodeArray = nodes.toArray(nodeArray);
            return nodeArray;
>>>>>>> master
        }
    }

    // Recursive helper function for inOrder
    protected void inOrderHelper(Node node, List<T> values) {
        if (node.left != null) {
            this.inOrderHelper(node.left, values);
        }
        values.add((T) node.value);
        if (node.right != null) {
            this.inOrderHelper(node.right, values);
        }
    }

    // Takes in the root node of a tree and returns an array containing the tree's nodes in post order
    public Object[] postOrder() {
        if (root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<T> values = new ArrayList<>();
            this.postOrderHelper(this.root, values);
            Object[] valuesArray = new Object[values.size()];
            valuesArray = values.toArray(valuesArray);
            return valuesArray;
        }
    }

    // Recursive helper function for postOrder
    protected void postOrderHelper(Node node, List<T> values) {
        if (node.left != null) {
            this.postOrderHelper(node.left, values);
        }
        if (node.right != null) {
            this.postOrderHelper(node.right, values);
        }
        values.add((T) node.value);
    }
}
