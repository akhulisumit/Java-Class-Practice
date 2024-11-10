public class D3 {
    static void transpose(int[][] A) {
        int n = A.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++){ 
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }           
        }
    }
    

    static void print(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();            
        }
    }
    


    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(A);
        print(A);
    }
}
