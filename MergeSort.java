public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array:");
        printArray(array);
        
        // Sorting using Merge Sort
        mergeSort(array, 0, array.length - 1);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    
    // Merge Sort method
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int middle = left + (right - left) / 2;
            
            // Recursively sort the first and second halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            
            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }
    
    // Merge method to merge two halves of array
    public static void merge(int[] array, int left, int middle, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }
        
        // Merge the temporary arrays
        int i = 0, j = 0; // Initial indexes of first and second subarrays
        int k = left; // Initial index of merged subarray
        
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of leftArray[], if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of rightArray[], if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    // Utility method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
OUTPUT:
Original Array:
5 2 9 1 5 6 

Sorted Array:
1 2 5 5 6 9 

