public class D4 {

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

    static void reverseRows(int[][] A) {
        int n = A.length;
        
        for (int i = 0; i < n; i++) {
            int s = 0;
            int e = A[i].length - 1;            
            while (s < e) {
                int temp = A[i][s];
                A[i][s] = A[i][e];
                A[i][e] = temp;
                s++;
                e--;
            }
        }
    }

    static void rotate(int[][] A){
        transpose(A);
        reverseRows(A);
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
        rotate(A);
        print(A);
    }    
}
