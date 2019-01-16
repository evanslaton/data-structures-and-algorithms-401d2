package hashtable;

import tree.BinaryTree;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection<T> {
     public Set<T> treeIntersection(BinaryTree tree1, BinaryTree tree2) {
        Set<T> set1 = new HashSet<>();
        Set<T> set2 = new HashSet<>();
        Set<T> set3 = new HashSet<>();

        // Adds the values of the input trees into Sets
        for (Object o : tree1.preOrder()) set1.add((T) o);
        for (Object o : tree2.preOrder()) set2.add((T) o);

        // If removes all values from set1 that aren't also in set2
        for (T value : set1) {
            if (set2.contains(value)) {
                set3.add(value);
            }
        }
        return set3;
    }
}
