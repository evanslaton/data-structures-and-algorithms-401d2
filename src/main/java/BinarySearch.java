public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int searchKey) {
        int leftBoundary = 0;
        int rightBoundary = sortedArray.length - 1;
        int middle;
        while (leftBoundary <= rightBoundary) {
            middle = (int) Math.floor((leftBoundary + rightBoundary) / 2);
            if (sortedArray[middle] < searchKey) {
                leftBoundary = middle + 1;
            } else if (sortedArray[middle] > searchKey) {
                rightBoundary = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
