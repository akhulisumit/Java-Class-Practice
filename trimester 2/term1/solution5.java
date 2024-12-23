public class solution5 {
    public long subarraySum(int[] A) {
        int n = A.length;
        long totalSum = 0;
        for(int i = 0; i<n; i++){
            totalSum += (long) A[i]*(i+1)*(n-i);
        }
        return totalSum;
    }
    
}
