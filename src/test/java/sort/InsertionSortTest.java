package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] testArray1 = {4,3,1,8,5,7,2};
        int[] testArray2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] testArray3 = {};
        int[] testArray4 = {100, -3, 5, -42, 66};

        int[] testArray1Sorted = {1, 2, 3, 4, 5, 7, 8};
        int[] testArray2Sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] testArray3Sorted = {};
        int[] testArray4Sorted = {-42, -3, 5, 66, 100};

        assertArrayEquals(testArray1Sorted, InsertionSort.insertionSort(testArray1));
        assertArrayEquals(testArray2Sorted, InsertionSort.insertionSort(testArray2));
        assertArrayEquals(testArray3Sorted, InsertionSort.insertionSort(testArray3));
        assertArrayEquals(testArray4Sorted, InsertionSort.insertionSort(testArray4));
    }
}