import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 4, 1};
        
        boolean isSubset = isSubset(array1, array2);
        
        if (isSubset) {
            System.out.println("array2 is a subset of array1");
        } else {
            System.out.println("array2 is not a subset of array1");
        }
    }
    
    // Method to check if array2 is a subset of array1
    public static boolean isSubset(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        
        // Add all elements of array1 to a HashSet
        for (int num : array1) {
            set.add(num);
        }
        
        // Check if all elements of array2 are present in the HashSet
        for (int num : array2) {
            if (!set.contains(num)) {
                return false;
            }
        }
        
        return true;
    }
}
OUTPUT:
array2 is a subset of array1

