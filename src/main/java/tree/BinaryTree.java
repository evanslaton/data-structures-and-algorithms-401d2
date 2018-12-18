package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    public static void main(String[] args) {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(-21, null, null);
        testBinaryTree.root.left = new Node(99, null, null);
        testBinaryTree.root.right = new Node(496, null, null);
        testBinaryTree.root.right.left = new Node (32, null, null);
        testBinaryTree.root.right.right = new Node (3, null, null);

        Node[] values = testBinaryTree.postOrder(testBinaryTree.root);

        System.out.println(values[0].value);
        System.out.println(values[1].value);
        System.out.println(values[2].value);
        System.out.println(values[3].value);
        System.out.println(values[4].value);


//        testBinaryTree.inOrder();
//        testBinaryTree.postOrder();
    }


    Node<T> root;

    // Constructor
    BinaryTree() {
        this.root = null;
    }

    // Takes in the root node of a tree and returns an array containing the tree's nodes in pre-order
    public Node[] preOrder(Node<T> root) {
        if (root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<Node> nodes = new ArrayList<>();
            this.preOrderHelper(this.root, nodes);
            System.out.println(nodes);
            Node[] nodeArray = new Node[nodes.size()];
            nodeArray = nodes.toArray(nodeArray);
            return nodeArray;
        }
    }

    // Recursive helper function for preOrder
    protected void preOrderHelper(Node node, List<Node> values) {
        values.add(node);
        if (node.left != null) {
            this.preOrderHelper(node.left, values);
        }
        if (node.right != null) {
            this.preOrderHelper(node.right, values);
        }
    }

    // Takes in the root node of a tree and returns an array containing the tree's nodes in order
    public Node[] inOrder(Node root) {
        if (root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<Node> nodes = new ArrayList<>();
            this.inOrderHelper(this.root, nodes);
            Node[] nodeArray = new Node[nodes.size()];
            nodeArray = nodes.toArray(nodeArray);
            return nodeArray;
        }
    }

    // Recursive helper function for inOrder
    protected void inOrderHelper(Node node, List<Node> values) {
        if (node.left != null) {
            this.inOrderHelper(node.left, values);
        }
        values.add(node);
        if (node.right != null) {
            this.inOrderHelper(node.right, values);
        }
    }

    // Takes in the root node of a tree and returns an array containing the tree's nodes in post order
    public Node[] postOrder(Node root) {
        if (root == null) {
            System.out.println("This tree is empty.");
            return null;
        } else {
            List<Node> nodes = new ArrayList<>();
            this.postOrderHelper(this.root, nodes);
            System.out.println(nodes);
            Node[] nodeArray = new Node[nodes.size()];
            nodeArray = nodes.toArray(nodeArray);
            return nodeArray;
        }
    }

    // Recursive helper function for postOrder
    protected void postOrderHelper(Node node, List<Node> values) {
        if (node.left != null) {
            this.postOrderHelper(node.left, values);
        }
        if (node.right != null) {
            this.postOrderHelper(node.right, values);
        }
        values.add(node);
    }
}
