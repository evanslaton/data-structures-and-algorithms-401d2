package sort;

import java.util.ArrayList;

public class RadixSort {
    public static int[] radixSort(int[] arr) {
        if (arr.length < 1) return arr;

        // Creates an array of ArrayLists and gives each index a new ArrayList
        ArrayList[] bucket = new ArrayList[10];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }

        int value; // Assigned the digit within a number being looked at
        int selector = 1; // Used to get the individual digits within a number
        int index = 0; // Used in the final loop to keep track of what index the next number should be put in

        // Iterates as many times as there are digits in an int (loops 3 times for an array of numbers 3 digits long)
        for (int i = 0; i < String.valueOf(arr[0]).length(); i++) {
            // Puts the values in the array into their appropriate 'buckets'
            for (int j = 0; j < arr.length; j++) {
                value = (arr[j]/selector) % 10;
                bucket[value].add(arr[j]);
            }

            // Gets numbers out of the buckets and puts them back into arr in the appropriate order
            for (int j = 0; j < bucket.length; j++) {
                for (int k = 0; k < bucket[j].size(); k++) {
                    arr[index] = (int) bucket[j].get(k);
                    index++;
                }
                // Writes over the ArrayList at index j once its values have been put into arr
                bucket[j] = new ArrayList<Integer>();
            }
            selector *= 10;
            index = 0;
        }
        return arr;
    }
}
