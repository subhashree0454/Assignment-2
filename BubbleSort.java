public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Original Array:");
        printArray(array);
        
        // Sorting using Bubble Sort
        bubbleSort(array);
        
        System.out.println("\nSorted Array:");
        printArray(array);
    }
    
    // Bubble Sort method
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no elements were swapped in the inner loop, array is already sorted
            if (!swapped) {
                break;
            }
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

