import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        
        // Method 1: Using HashSet
        findDuplicatesUsingHashSet(array);
    }
    
    // Method 1: Using HashSet
    public static void findDuplicatesUsingHashSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (int num : array) {
            if (!set.add(num)) { // If the number is already in set, add it to duplicates set
                duplicates.add(num);
            }
        }
        
        System.out.println("Duplicates found using HashSet: " + duplicates);
    }
}
OUTPUT:
Duplicates found using HashSet: [1, 2, 3]

