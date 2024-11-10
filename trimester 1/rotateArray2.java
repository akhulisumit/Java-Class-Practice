public class rotateArray2 {
    static void reverse(int A[], int s, int e){
        for(int i = s; i<e; i++){
            int temp = A[i];
            A[i] = A[e];
            A[e] = temp;
            e--;
        }
        
    }
    void rotate(int A[], int d) {
        reverse(A, 0, d-1);
        reverse(A, d, A.length-1);
        reverse(A, 0, A.length-1);
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};

    }
}
