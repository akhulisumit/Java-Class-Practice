public class test31 {
    static void sorted(int A[]){
        int n = A.length;
        for(int s=0; s<=n-1; s++){
            SwapMin(A, s);
        }
    }

    static void SwapMin(int[] A, int s){
        int minIndex = s;
        for(int i = s; i<A.length; i++){
            if(A[i]<A[minIndex]){
                minIndex=i;
            }
        }
        int temp = A[minIndex];

    }

    public static void main(String[] args) {
        int[] A = {1,8,5,4,9,7,2};
        
    }
}
