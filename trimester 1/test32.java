public class test32 {

    static void sort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n-1-i; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }

    static void print(int[] A){
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] A = {1,8,5,4,9,7,2};

        sort(A);
        print(A);       
    }
}
