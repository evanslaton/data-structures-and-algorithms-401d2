package tree;

public class BinarySearchTree extends BinaryTree {

    // Constructor
    public BinarySearchTree() {
        super();
    }

    // Got help from https://www.baeldung.com/
    // Adds the value to the tree whose root you pass in as the first parameter
    public void add(Integer value) {
        if (this.root == null) {
            this.root = new Node(value, null, null);
        }
        addHelper(this.root, value);
    }

    // Called by the add method, makes it so the user doesn't have to input the tree.root when calling add
    public Node addHelper(Node<Integer> node, Integer value) {
        if (node == null) {
            return new Node(value, null, null);
        }

        if (value < node.value) {
            node.left = addHelper(node.left, value);
        } else if (value > node.value) {
            node.right = addHelper(node.right, value);
        } else {
            return node;
        }
        return node;
    }

    // Returns true if the inputted value exists in the tree, false if it doesn't
    public boolean contains(Integer value) {
        return containsHelper(this.root, value);
    }

    // Called by the contains method, makes it so the user doesn't have to input the tree.root when calling contains
    public boolean containsHelper(Node<Integer> node, Integer value) {
        if (node == null) {
            return false;
        }
        if (node.value.equals(value)) {
            return true;
        }
        return value < node.value ? containsHelper(node.left, value) : containsHelper(node.right, value);
    }

}


