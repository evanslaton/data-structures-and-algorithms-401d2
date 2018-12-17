package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static void main(String[] args) {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(-21, null, null);
        testBinaryTree.root.left = new Node(99, null, null);
        testBinaryTree.root.right = new Node(496, null, null);
        testBinaryTree.root.right.left = new Node (32, null, null);
        testBinaryTree.root.right.right = new Node (3, null, null);

        testBinaryTree.preOrder();
        testBinaryTree.inOrder();
        testBinaryTree.postOrder();
    }


    Node root;

    BinaryTree() {
        this.root = null;
    }

    // Returns a list of the tree's values in pre-order
    public List<Integer> preOrder() {
        if (this.root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<Integer> values = new ArrayList<>();
            this.preOrderHelper(this.root, values);
            System.out.println(values);
            return values;
        }
    }

    // Recursive helper function for preOrder
    protected void preOrderHelper(Node root, List<Integer> values) {
        values.add(root.value);
        if (root.leftChild() != null) {
            this.preOrderHelper(root.left, values);
        }
        if (root.rightChild() != null) {
            this.preOrderHelper(root.right, values);
        }
    }

    // Returns a list of the tree's values in order
    public List<Integer> inOrder() {
        if (this.root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<Integer> values = new ArrayList<>();
            this.inOrderHelper(this.root, values);
            System.out.println(values);
            return values;
        }
    }

    // Recursive helper function for inOrder
    protected void inOrderHelper(Node root, List<Integer> values) {
        if (root.leftChild() != null) {
            this.inOrderHelper(root.left, values);
        }
        values.add(root.value);
        if (root.rightChild() != null) {
            this.inOrderHelper(root.right, values);
        }
    }

    // Returns a list of the tree's values in post-order
    public List<Integer> postOrder() {
        if (this.root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<Integer> values = new ArrayList<>();
            this.postOrderHelper(this.root, values);
            System.out.println(values);
            return values;
        }
    }

    // Recursive helper function for postOrder
    protected void postOrderHelper(Node root, List<Integer> values) {
        if (root.leftChild() != null) {
            this.postOrderHelper(root.left, values);
        }
        if (root.rightChild() != null) {
            this.postOrderHelper(root.right, values);
        }
        values.add(root.value);
    }
}
