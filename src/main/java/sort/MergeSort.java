package sort;

// https://www.baeldung.com/java-merge-sort
public class MergeSort {
    // Returns the input array if its length is less than 2 (already sorted)
    public static int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.ceil(arr.length/2);
        int[] firstHalf = new int[middle];
        int[] secondHalf = new int[arr.length - middle];

        // Creates a new array containing the first half of the input array
        for (int i = 0; i < firstHalf.length; i++) {
            firstHalf[i] = arr[i];
        }

        // Creates a new array containing the second half of the input array
        for (int i = 0; i < secondHalf.length; i++) {
            secondHalf[i] = arr[middle + i];
        }
        return merge(mergeSort(firstHalf), mergeSort(secondHalf));
    }

    public static int[] merge(int[] firstHalf, int[] secondHalf) {
        int[] merged = new int[firstHalf.length + secondHalf.length];

        // Variable keep track of the array indexes currently being "looked at"
        int i = 0;
        int j = 0;
        int k = 0;

        // Checks the "next" value in each input array and adds the lower one to the new array
        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] <= secondHalf[j]) {
                merged[k] = firstHalf[i];
                k++;
                i++;
            } else {
                merged[k] = secondHalf[j];
                k++;
                j++;
            }
        }

        // Adds the rest of the values of the firstHalf array
        while(i < firstHalf.length) {
            merged[k] = firstHalf[i];
            k++;
            i++;
        }

        // Adds the rest of the values of the secondHalf array
        while(j < secondHalf.length) {
            merged[k] = secondHalf[j];
            k++;
            j++;
        }
        return merged;
    }
}
