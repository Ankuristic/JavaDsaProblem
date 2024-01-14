public class checkSortedArray {
    
    public static boolean isSorted(int[] array) {
        // Check if the array is null or empty
        if (array == null || array.length <= 1) {
            return true;
        }

        // Iterate through the array to check if it is sorted
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; // Array is not sorted
            }
        }

        return true; // Array is sorted
    }

    public static void main(String[] args) {
        // Example usage
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 2, 8, 1, 9};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray)); // Should print true
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray)); // Should print false
    }
}
