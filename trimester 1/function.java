import java.util.*;
public class function {

    static void reverse(int A[], int s, int e){
        for(int i = s; i<e; i++){
            int temp = A[i];
            A[i] = A[e];
            A[e] = temp;
            e--;
        }
        
    }

    static void print(int A[]){
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+" ");
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); 
        int e = sc.nextInt();  
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        reverse(A, s, e);
        print(A);
        sc.close();
    }
}
