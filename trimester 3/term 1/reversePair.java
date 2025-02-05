public class reversePair {
    public int solve(int[] A) {
        int n = A.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0;j<n; j++){
                if(i<j && A[i]>2*A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
