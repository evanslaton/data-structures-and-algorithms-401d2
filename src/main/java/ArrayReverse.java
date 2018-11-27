public class ArrayReverse {
    public static void main(String[] args) {
        int[] arrayToReverse = new int[6];

        for(int i = 0; i < 6; i++) {
            arrayToReverse[i] = i;
        }

        reverseArray(arrayToReverse);
    }

    public static int[] reverseArray( int[] arrayToReverse){
        int[] reversedArray = new int[arrayToReverse.length];

        for(int i = 0; i < arrayToReverse.length; i++) {
            reversedArray[i] = arrayToReverse[arrayToReverse.length - i - 1];
        }

        return reversedArray;
    }
}
