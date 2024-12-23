import java.util.ArrayList;

public class Solution {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int primeSubarrayCount = 0;
        
        int[] prefixSum = new int[n];
        prefixSum[0] = A.get(0);
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A.get(i);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                
                if (isPrime(sum)) {
                    primeSubarrayCount++;
                }
            }
        }
        
        return primeSubarrayCount;
    }

    
}
