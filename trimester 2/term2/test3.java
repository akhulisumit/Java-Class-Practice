import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            // Create sorted array for comparison
            long[] sorted = arr.clone();
            Arrays.sort(sorted);

            boolean possible = true;
            for (int i = 0; i < n && possible; i++) {
                int pos = findPos(arr[i], i, sorted);
                if (Math.abs(pos - i) >= k) {
                    possible = false;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }

    private static int findPos(long value, int start, long[] sorted) {
        for (int i = start; i < sorted.length; i++) {
            if (sorted[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
