import java.util.Scanner;

public class evenSumOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        int n = arr.length;
        int [] prefixSum = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                sum+=1;
            }
            prefixSum[i] = sum;
        }
        int Q = sc.nextInt();
        while(Q-->0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            System.out.println(prefixSum[e]);
        }
    }
}
