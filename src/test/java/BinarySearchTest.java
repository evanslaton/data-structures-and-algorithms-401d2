import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] sortedArrayPass = {4,8,15,16,23,42};
        int searchKeyPass = 15;

        int[] sortedArrayFail = {11,22,33,44,55,66,77};
        int searchKeyFail = 90;

        int[] sortedArrayFail2= {};
        int searchKeyFail2 = 43;

        assertEquals("binarySearch should return 2", 2, BinarySearch.binarySearch(sortedArrayPass, searchKeyPass));
        assertEquals("binarySearch should return -1", -1, BinarySearch.binarySearch(sortedArrayFail, searchKeyFail));
        assertEquals("binarySearch should return -1", -1, BinarySearch.binarySearch(sortedArrayFail2, searchKeyFail2));
    }
}