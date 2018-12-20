package tree;

public class GetMaxValueTree<T> extends BinaryTree<T> {
    public static Integer maxValue;

    GetMaxValueTree() {
        Integer maxValue = null;
    }

    public static Integer findMaximumValue(BinaryTree tree) {
        if (tree.root == null) {
            return null;
        }
        GetMaxValueTree.maxValue = (Integer) tree.root.value;
        GetMaxValueTree.recursiveSearch(tree.root);
        return maxValue;
    }

    public static void recursiveSearch(Node node) {
        if ((Integer) node.value > GetMaxValueTree.maxValue) maxValue = (Integer) node.value;
        if (node.left != null) recursiveSearch(node.left);
        if (node.right != null) recursiveSearch(node.right);
    }
}
