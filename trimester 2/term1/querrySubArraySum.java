import java.util.Scanner;

public class querrySubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int s = sc.nextInt();
        int e = sc.nextInt();
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
