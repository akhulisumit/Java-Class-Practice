public class inversion {
    public int countInversions(int[] A) {
        int count = 0;
        for(int i = 0; i<A.length; i++){
            for(int j = i; j<A.length; j++){
                if(A[i]>A[j] && i<j){
                    count++;
                }
            }
        }

        return count;
    }    
}
