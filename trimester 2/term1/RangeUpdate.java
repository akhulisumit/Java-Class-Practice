import java.util.Scanner;

public class RangeUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int n = A.length;

        int[] D = new int[n + 1];

        System.out.print("Enter the number of queries: ");
        int Q = sc.nextInt();

        for (int q = 0; q < Q; q++) {
            System.out.print("Enter the start index, end index, and value to add: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int val = sc.nextInt();

            if (l < 0 || r >= n || l > r) {
                System.out.println("Invalid indices. Please try again.");
                q--; 
                continue;
            }

            D[l] += val;
            if (r + 1 < n) {
                D[r + 1] -= val;
            }
        }

        A[0] = D[0];
        for (int i = 1; i < n; i++) {
            A[i] = A[i - 1] + D[i];
        }

        // Display the updated array
        System.out.println("Updated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
