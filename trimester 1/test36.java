import java.util.ArrayList;
import java.util.*;
public class test36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 4;
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                int val = sc.nextInt();
                temp.add(val);
            }
            A.add(temp);
        }
        System.out.println(A);
    }
}
