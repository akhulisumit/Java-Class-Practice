

public class subarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        for(int start = 0; start<n; start++){
            for(int end = start; end<n; end++){
                for(int i = start; i<end; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
