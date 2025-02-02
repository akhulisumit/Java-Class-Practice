import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 3, 5, 6, 3, 2, 1, 3 };
        Map<Integer, Integer> frquencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (frquencyMap.containsKey(arr[i])) {
                frquencyMap.put(arr[i], frquencyMap.get(arr[i]) + 1);
            } else {
                frquencyMap.put(arr[i], 1);
            }
        }

        int maxValue = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frquencyMap.entrySet()) {
            Integer currentElement = entry.getKey();
            Integer currentFrequency = entry.getValue();

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxValue = currentElement;
            }
        }

        System.out.println(maxValue + " " + maxFrequency);
    }
}
