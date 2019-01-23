package sort;

// https://www.baeldung.com/java-quicksort
// https://www.youtube.com/watch?v=Fiot5yuwPAg&t=416s
// Cracking the Coding Interview by Gayle Laakmann McDowell
// Algorithms 4th Edition by Robert Sedgewick and Kevin Wayne
public class QuickSort {

    public static int[] quickSort(int[] arr) {
        // Passes the array, the first index of the array and last index of the array to the helper function of the same name
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    // Helper function that recurses through smaller halves of the arr
    protected static void quickSort(int arr[], int start, int end) {
        // Checks to see if there is anything left to sort
        if (start < end) {
            // Gets the index of the 'pivot' value - see comment on line 41
            int partitionIndex = partition(arr, start, end);

            // Calls quickSort on the half of the array that is smaller than the 'pivot' value
            quickSort(arr, start, partitionIndex - 1);
            // Calls quickSort on the half of the array that is larger than the 'pivot' value
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    protected static int partition(int arr[], int start, int end) {
        int pivot = arr[end]; // The last value of the part of the array being used
        int i = (start - 1); // Used to keep track of the values that are greater than pivot

        // Loops through arr and swaps values that are less than pivot with values that are greater than pivot
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Moves pivot to its proper place in the array (after the values lower than itself and before the values greater than itself)
        swap(arr, i + 1, end);

        return i + 1; // Returns the index of pivot
    }

    // Swaps the value at arr[first] with the value at arr[second]
    protected static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

// ORIGINAL ATTEMPT:
//        if (arr.length < 2) {
//            return arr;
//        }
//        int pivot = arr[0];
//        System.out.println(pivot);
//        List<Integer> smallerThan = new ArrayList<>();
//        List<Integer> largerThan = new ArrayList<>();
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < pivot) {
//                smallerThan.add(arr[i]);
//            } else {
//                largerThan.add(arr[i]);
//            }
//        }
//
//        int[] smallerThanArray = new int[smallerThan.size()];
//        for (int i = 0; i < smallerThan.size(); i++) {
//            smallerThanArray[i] = smallerThan.get(i);
//        }
//        int[] largerThanArray = new int[largerThan.size()];
//        for (int i = 0; i < largerThan.size(); i++) {
//            largerThanArray[i] = largerThan.get(i);
//        }
//
//        int[] small = quickSort(smallerThanArray);
//        int[] large = quickSort(largerThanArray);
//
//        List<Integer> answer = new ArrayList<>();
//        for (int i = 0; i < small.length; i++) {
//            answer.add(small[i]);
//        }
//        answer.add(pivot);
//        for (int i = 0; i < large.length; i++) {
//            answer.add(large[i]);
//        }
//
//        https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
//        return answer.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
//    }
}
