import java.lang.*;
import java.util.*;

public class test19 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                boolean b=true;
                for(int j=0;j<n;j++){
                    if(i!=j){
                        if(arr[i]==arr[j]){
                            b=false;
                        }
                    }
                }
                if(b){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}