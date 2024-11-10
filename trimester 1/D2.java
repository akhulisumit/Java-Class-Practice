public class D2 {
    public static void main(String[] args) {
        int[][] array2D = {
            {3, 1, 2, 0, 10},
            {7, 5, 6, 11, 12},
            {14, 15, 16, 19, 1},
            {3, 5, 8, 9, 10}
        };
        
        int n = array2D.length;        // Number of rows
        int m = array2D[0].length;     // Number of columns

        // 1. Printing the 2D array row by row
        System.out.println("Row by Row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        // 2. Printing the transposed array (columns as rows)
        System.out.println("\nTransposed (Columns as Rows):");
        for (int i = 0; i < m; i++) {  // Looping over columns
            for (int j = 0; j < n; j++) {  // Looping over rows
                System.out.print(array2D[j][i] + " ");
            }
            System.out.println();
        }

        // 3. Printing the 2D array in reverse order (from bottom-right to top-left)
        System.out.println("\nReverse (Bottom-Right to Top-Left):");
        for (int i = n - 1; i >= 0; i--) {  // Iterate from last row to first row
            for (int j = m - 1; j >= 0; j--) {  // Iterate from last column to first column
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
