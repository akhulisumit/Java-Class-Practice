import java.util.ArrayList;

public class test34 {
    public static void main(String[] args) {
        int[][] A = {{2,3,3,2},{1,6,6,2},{7,8,9,9},{1,1,2,3}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
