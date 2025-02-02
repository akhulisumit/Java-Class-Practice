import java.util.*;

public class DuplicateElementCounter {
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 3};

        // Create a map to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies of each element in the array
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Count the number of duplicate elements
        int duplicateCount = 0;
        for (int count : frequencyMap.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        // Output the result
        System.out.println("Total number of duplicate elements: " + duplicateCount);
    }
}
