import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int startRow = N - 1; startRow >= 0; startRow--) {
            int row = startRow, col = 0;
            while (row < N && col < M) {
                System.out.print(A[row][col] + " ");
                row++;
                col++;
            }
        }

        for (int startCol = 1; startCol < M; startCol++) {
            int row = 0, col = startCol;
            while (row < N && col < M) {
                System.out.print(A[row][col] + " ");
                row++;
                col++;
            }
        }

        sc.close();
    }
}