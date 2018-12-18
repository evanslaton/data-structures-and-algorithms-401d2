package fizzbuzztree;

import tree.BinaryTree;
import tree.Node;

public class FizzBuzzTree {
    public static void main(String[] args) {
        BinaryTree testBinaryTree = new BinaryTree();

        testBinaryTree.root = new Node(3, null, null);
        testBinaryTree.root.left = new Node(1, null, null);
        testBinaryTree.root.right = new Node(15, null, null);
        testBinaryTree.root.right.left = new Node (6, null, null);
        testBinaryTree.root.right.right = new Node (13, null, null);

        Node[] values = testBinaryTree.postOrder(testBinaryTree.root);
        FizzBuzzTree.fizzBuzzTree(testBinaryTree);
        Node[] values2 = testBinaryTree.postOrder(testBinaryTree.root);
    }

    public static BinaryTree<Node> fizzBuzzTree(BinaryTree<Node> tree) {
        if (tree.root == null) {
            return tree;
        }
        recursiveSearch(tree.root);
        return tree;
    }

    public static Node recursiveSearch(Node node) {
        if (node == null) {
            return null;
        } else {
            fizzBuzzify(node);
        }

        recursiveSearch(node.left);
        recursiveSearch(node.right);
        return node;
    }

    public static void fizzBuzzify(Node node) {
        if ((int) node.value % 3 == 0 && (int) node.value % 5 == 0) {
            node.value = "FizzBuzz";
        } else if ((int) node.value % 3 == 0) {
            node.value = "Fizz";
        } else if ((int) node.value % 5 == 0) {
            node.value = "Buzz";
        }
    }
}
