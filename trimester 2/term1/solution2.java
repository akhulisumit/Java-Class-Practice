public class solution2 {
    public int solve(int[] A) {
        int n = A.length;
        
        int totalSum = 0;
        for (int num : A) {
            totalSum += num;
        }
        
        int leftSum = 0;
        
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - A[i];
            
            if (leftSum == rightSum) {
                return i;
            }
            
            leftSum += A[i];
        }
        
        return -1;
    }
}
