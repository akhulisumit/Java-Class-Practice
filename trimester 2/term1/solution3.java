public class solution3 {
    public long[] rangeSum(int[] A, int[][] B) {
        int n = A.length;
        long[] arraySum = new long[n];
        arraySum[0]= A[0];
        for(int i = 1; i<n; i++){
            arraySum[i] = arraySum[i-1]+A[i];
        }

        long[] result = new long[B.length];

        for(int i = 0; i<B.length; i++){
            int L = B[i][0];
            int R = B[i][1];
            if(L==0){
                result[i] = arraySum[R];
            }
            else{
                result[i] = arraySum[R] - arraySum[L-1];
            }
        }
        return result;
    }
}
