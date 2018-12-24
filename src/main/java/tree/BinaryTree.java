package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    public static void main(String[] args) {
//        BinaryTree testBinaryTree = new BinaryTree();
//
//        testBinaryTree.root = new Node(-21, null, null);
//            testBinaryTree.root.left = new Node(99, null, null);
//            testBinaryTree.root.right = new Node(496, null, null);
//                testBinaryTree.root.right.left = new Node (32, null, null);
//                testBinaryTree.root.right.right = new Node (3, null, null);
//
//        Node[] values = testBinaryTree.postOrder(testBinaryTree.root);
//
//        System.out.println(values[0].value);
//        System.out.println(values[1].value);
//        System.out.println(values[2].value);
//        System.out.println(values[3].value);
//        System.out.println(values[4].value);
//
//        testBinaryTree.preOrder();
////        testBinaryTree.inOrder();
////        testBinaryTree.postOrder();
    }


    Node<T> root;

    // Constructor
    BinaryTree() {
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
            List<T> values = new ArrayList<>();
            this.inOrderHelper(this.root, values);
            Object[] valuesArray = new Object[values.size()];
            valuesArray = values.toArray(valuesArray);
            return valuesArray;
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
