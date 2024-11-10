import java.util.ArrayList;
import java.util.Scanner;

public class test37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 4;
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>(); // Create a new list for each row
            for (int j = 0; j < m; j++) {
                int val = sc.nextInt();
                temp.add(val);
            }
            A.add(temp); // Add the new row to A
        }

        System.out.println(A);
        sc.close();
    }
}
