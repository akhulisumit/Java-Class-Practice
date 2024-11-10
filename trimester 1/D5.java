public class D5 {

    static int[][] multiply(int[][] A, int[][] B) {
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix multiplication is not possible. Columns of A must match rows of B.");
        }

        int[][] C = new int[r1][c2]; 

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        int[][] A = {{2, 3, 1}, {0, 1, 8}};
        int[][] B = {{1, 0}, {2, 1}, {3, 4}};
        int[][] C = multiply(A, B);
        print(C);
    }  
}
