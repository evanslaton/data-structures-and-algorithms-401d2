package tree;

import StacksAndQueues.Queue;

public class OtherBinaryTree<T> extends BinaryTree<T> {
    OtherBinaryTree() {
        super();
    }

    public static void breadthFirst(BinaryTree tree) {
        Queue<Node> queue = new Queue<>();
        queue.enqueue(tree.root);
        while (queue.peek() != null) {
            Node front = queue.dequeue();
            System.out.print(front.value + " ");
            if (front.left != null) {
                queue.enqueue(front.left);
            }
            if (front.right != null) {
                queue.enqueue(front.right);
            }
        }
    }
}
