import java.util.Scanner;

public class maxSumofSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        System.out.print("Enter the size of the subarray (m): ");
        int m = sc.nextInt();

        if (m > n || m <= 0) {
            System.out.println("Invalid subarray size.");
            return;
        }

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < m; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        // Slide the window across the array
        for (int i = m; i < n; i++) {
            currentSum += arr[i] - arr[i - m]; // Slide the window
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum sum of subarray of size " + m + " is: " + maxSum);
    }
}
