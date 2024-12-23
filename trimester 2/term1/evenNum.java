import java.util.Scanner;

public class evenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < Q; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int count = 0;
            for (int j = s; j <= e; j++) {
                if (arr[j] % 2 == 0) {
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
