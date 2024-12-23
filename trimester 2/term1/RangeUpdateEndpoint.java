import java.util.Scanner;

public class RangeUpdateEndpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int n = A.length;

        
        System.out.print("Enter the number of queries: ");
        int Q = sc.nextInt();

        for (int q = 0; q < Q; q++) {
            System.out.print("Enter the index, end and value to add: ");
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();
            A[start] += value;
            if(end==n){
                continue;
            }
            A[end+1] -= value;
            
        }

        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        System.out.println("Updated array:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }
}
