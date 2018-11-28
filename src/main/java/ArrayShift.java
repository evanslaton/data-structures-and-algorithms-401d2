public class ArrayShift {
    public static void main(String[] args) {
        int[] testArray1 = { 2, 4, 6, 8 };
        int testVal1 = 5;
        insertShiftArray(testArray1, testVal1);

        System.out.println();

        int[] testArray2 = { 4, 8, 15, 23, 42 };
        int testVal2 = 16;
        insertShiftArray(testArray2, testVal2);
    }

    public static int[] insertShiftArray(int[] arrayToShift, int valueToAdd) {
        int[] shiftedArray = new int[arrayToShift.length + 1];
        int center = findTheCenter(arrayToShift);

        for (int i = 0; i < arrayToShift.length + 1; i++) {
            if (i < center) {
                shiftedArray[i] = arrayToShift[i];
            } else if (i == center) {
                shiftedArray[i] = valueToAdd;
            } else {
                shiftedArray[i] = arrayToShift[i - 1];
            }
            System.out.println(shiftedArray[i]);
        }
        return shiftedArray;
    }

    public static int findTheCenter(int[] findTheCenterOf) {
        if (findTheCenterOf.length % 2 != 0) {
            return findTheCenterOf.length / 2 + 1;
        } else {
            return findTheCenterOf.length / 2;
        }
    }
}
