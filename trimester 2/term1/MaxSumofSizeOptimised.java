import java.util.Scanner;

public class MaxSumofSizeOptimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;

        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        int maxSum = prefixSum[k - 1];

        int s = 1;
        int e = k;
        while (e<n) {
            int sum = prefixSum[e] - prefixSum[s - 1];
            maxSum = Math.max(maxSum, sum);
            e++;
            s++;         
        }
        System.out.println(maxSum);

    }
}
