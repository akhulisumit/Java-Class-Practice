public class solution7 {
    public long solve(int[] A, int B) {
        int n = A.length;
        
        long maxSum = 0;
        long currentSum = 0;
        for(int i = 0; i<B; i++){
            currentSum += A[i];
        }
        maxSum = currentSum;

        for(int i = B; i<n; i++){
            currentSum += A[i] - A[i-B];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
