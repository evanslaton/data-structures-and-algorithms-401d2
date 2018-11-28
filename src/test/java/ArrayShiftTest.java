import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testArrayShift1() {
        int[] arrayToTest = {1,2,3,4};
        assertEquals("returned array should be one longer", arrayToTest.length + 1, ArrayShift.insertShiftArray(arrayToTest, 5).length);
    }

    @Test
    public void testArrayShift2() {
        int[] arrayToTest = {1,2,3,4};
        int[] arrayToCompare = {1,2,10,3,4};
        int valueToInsert = 10;
        assertArrayEquals("10 should be added to the center of the array", arrayToCompare, ArrayShift.insertShiftArray(arrayToTest, valueToInsert));
    }

    @Test
    public void testArrayShift3() {
        int[] arrayToTest = {1,2,3};
        int[] arrayToCompare = {1,2,15,3};
        int valueToInsert = 15;
        assertArrayEquals("15 should be added to the center of the array", arrayToCompare, ArrayShift.insertShiftArray(arrayToTest, valueToInsert));
    }
}