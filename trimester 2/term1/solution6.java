public class solution6 {
    public int[] solve(int A, int[][] B) {
        int m = B.length;
        int[] ans = new int[A];
        for(int i = 0; i<A; i++){
            ans[i] = 0;
        }
        for(int i = 0; i<m; i++){
            int L = B[i][0] - 1;
            int R = B[i][1] - 1;
            int x = B[i][2];

            ans[L] += x;
            if(R+1<A){
                ans[R+1] -= x;
            }
        }
        for(int i = 1; i<A; i++){
            ans[i] += ans[i-1];
        }
        return ans;
    }
}
