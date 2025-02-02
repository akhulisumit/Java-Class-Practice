import java.util.*;

public class UtilityFunctions {

    // Prefix Sum Implementation
    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    // Binary Search Implementation
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    // HashSet Example
    public static void hashSetExample() {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("HashSet contents: " + set);
        System.out.println("Contains 20? " + set.contains(20));
        set.remove(20);
        System.out.println("After removing 20, HashSet: " + set);
    }

    // HashMap Example
    public static void hashMapExample() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("Charlie", 95);

        System.out.println("HashMap contents: " + map);
        System.out.println("Bob's score: " + map.get("Bob"));
        map.remove("Alice");
        System.out.println("After removing Alice, HashMap: " + map);
    }

    // Main Method
    public static void main(String[] args) {
        // Example for Prefix Sum
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = prefixSum(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefix));

        // Example for Binary Search
        int target = 3;
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

        // Example for HashSet
        hashSetExample();

        // Example for HashMap
        hashMapExample();
    }
}
