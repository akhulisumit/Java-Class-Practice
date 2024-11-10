public class test33 {
    static int[] insert(int[] A, int x, int i) {
        for (int j = 0; j > i; j--) {
            A[j] = A[j + 1];
        }
        
        return A;
    }
    public static void main(String[] args) {
        int[] A=new int[2];
        A = insert(A, 1, 0);
        A = insert(A, 2, 1);
        A = insert(A, 3, 2);

    }
}
