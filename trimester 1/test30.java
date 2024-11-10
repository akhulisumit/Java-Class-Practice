import java.util.Arrays;
import java.util.Scanner;

public class test30 {
    static void sorted(int[] A){
        int n = A.length;
        int temp = A[n-1];
        int i = n-2;
        while (A[i]>temp && i>=0) {
            A[i+1]=A[i];
            i--;
        }
        A[i+1] = temp;
        for(int j =0; j<n; j++){
            System.out.print(A[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,5,6,7,8,9,4};
        sorted(A);
        
    }
}
