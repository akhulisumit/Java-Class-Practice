import java.util.ArrayList;
import java.util.Scanner;

public class test39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>(); // Create a new list for each row
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                temp.add(val);
            }
            A.add(temp); // Add the new row to A
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top<= bottom) {
            for(int i=left; i<=right; i++) {
                ans.add(A.get(top).get(i));
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                ans.add(A.get(i).get(right));
            }
            right--;
            for(int i=right; i>=left; i--) {
                ans.add(A.get(bottom).get(i));
            }
            bottom--;
            for(int i=bottom; i>=top; i--) {
                ans.add(A.get(left).get(i));
            }
            left++;
        }

        System.out.println(ans);
        sc.close();
    }
}
