public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array:");
        printArray(array);
        
        // Sorting using Quicksort
        quickSort(array, 0, array.length - 1);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    
    // Quicksort method
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(array, low, high);
            
            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    
    // Partitioning method
    public static int partition(int[] array, int low, int high) {
        // Choosing the pivot element (last element in this case)
        int pivot = array[high];
        int i = low - 1; // Index of smaller element
        
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
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

