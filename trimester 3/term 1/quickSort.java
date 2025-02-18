public class quickSort {
    // Method to perform QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);  // Sort left partition
            quickSort(arr, partitionIndex + 1, high); // Sort right partition
        }
    }

    // Partition method using Lomuto's partition scheme
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1; // Pointer for greater element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than pivot
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high); // Place pivot at correct position
        return i + 1;
    }

    // Swap method to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Utility method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
