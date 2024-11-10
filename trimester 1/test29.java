import java.util.Arrays;
import java.util.Scanner;

public class test29 {
    static void sorted(int[] A, int e){
        int n = A.length-1;
        int temp = A[e+1];
        int i = e;
        while (A[i]>temp) {
            A[i+1]=A[i];
            i--;
        }
        A[i+1] = temp;
        for(int j =0; j<n+1; j++){
            System.out.print(A[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] A = {1,5,6,8,10,7,4,3,2,0,1};
        int e = 5;
        sorted(A, e);
        
    }
}
