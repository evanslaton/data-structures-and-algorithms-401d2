package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void testRadixSort() {
        int[] testArray1 = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int[] testArray1Sorted = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertArrayEquals(testArray1Sorted, RadixSort.radixSort(testArray1));

        int[] testArray2 = {1, 6, 5, 3, 8, 6, 2, 7, 4, 0, 8, 7, 6, 1, 2};
        int[] testArray2Sorted = {0, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 7, 8, 8};
        assertArrayEquals(testArray2Sorted, RadixSort.radixSort(testArray2));

        int[] testArray3 = {980, 134, 642, 437};
        int[] testArray3Sorted = {134, 437, 642, 980};
        assertArrayEquals(testArray3Sorted, RadixSort.radixSort(testArray3));

        int[] testArray4 = {100, 200, 300};
        int[] testArray4Sorted = {100, 200, 300};
        assertArrayEquals(testArray4Sorted, RadixSort.radixSort(testArray4));

        int[] testArray5 = {};
        int[] testArray5Sorted = {};
        assertArrayEquals(testArray5Sorted, RadixSort.radixSort(testArray5));

        int[] testArray6 = {6};
        int[] testArray6Sorted = {6};
        assertArrayEquals(testArray6Sorted, RadixSort.radixSort(testArray6));
    }
}