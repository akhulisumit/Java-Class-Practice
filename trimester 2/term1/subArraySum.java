

public class subArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        for(int start = 0; start<n; start++){
            for(int end = start; end<n; end++){
                int sum = 0;
                for(int i = start; i<end; i++){
                    System.out.print(arr[i]+" ");
                    sum += arr[i];
                }
                System.out.println("Sum: "+sum);
                System.out.println();
            }
            
        }
    }
}
