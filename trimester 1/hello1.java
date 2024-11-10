import java.util.*;

public class hello1 {
    public static void main(String[] args) {
        int a  = 4;
        int top = 0;
        int bottom = 2*a-2;
        int left = 0;
        int right = 2*a-2;
        int temp = a;
        int[][] arr = new int[2*a-1][2*a-1];
        while (top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                arr[top][i] = temp;
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                arr[i][right] = temp;
            }
            right--;
            for(int i=right; i>=left; i--) {
                arr[bottom][i] = temp;
            }
            bottom--;
            for(int i=bottom; i>=top; i--) {
                arr[i][left] = temp;
            }
            left++;
            temp--;
        }
        

        for(int i = 0; i<2*a-1; i++) {
            for(int j = 0; j<2*a-1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}
