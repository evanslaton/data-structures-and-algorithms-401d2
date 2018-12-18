package fizzbuzztree;

import tree.BinaryTree;
import tree.Node;

public class FizzBuzzTree {
    // Takes in a BinaryTree and turns all node values that are divisible by 3 and 5 to 'FizzBuzz', divisible by 5 to 'Buzz' and divisible by 3 to 'Fizz'
    public static BinaryTree<Node> fizzBuzzTree(BinaryTree<Node> tree) {
        if (tree.root == null) {
            return tree;
        }
        recursiveSearch(tree.root);
        return tree;
    }

    // Checks each node in the BinaryTree and passes them into the fizzBuzzify helper function
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

    // Turns all node values that are divisible by 3 and 5 to 'FizzBuzz', divisible by 5 to 'Buzz' and divisible by 3 to 'Fizz'
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
