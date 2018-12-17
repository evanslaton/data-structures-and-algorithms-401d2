package tree;

public class BinarySearchTree extends BinaryTree {
    public static void main(String[] args) {
        BinarySearchTree testBinarySearchTree = new BinarySearchTree();
        testBinarySearchTree.add(10);
//        testBinarySearchTree.add(11);
//        testBinarySearchTree.add(5);

        testBinarySearchTree.preOrder();
        testBinarySearchTree.inOrder();
        testBinarySearchTree.postOrder();
// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
//        System.out.println(testBinarySearchTree.root.value);
    }

    public BinarySearchTree() {
        super();
    }

    public void add(int value) {
        this.addHelper(this.root, value);
    }

    protected Node addHelper(Node root, int value) {
        if (root == null) {
            root = new Node(value, null, null);
        }
        if (value < root.value) {
            root.left = addHelper(root.left, value);
        } else if (value > root.value) {
            root.right = addHelper(root.right, value);
        }
        return root;
    }
}


