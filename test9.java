import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int div = 5;
        int ans = 0;
        while (div<=x) {
            ans = ans + x/div;
            div = div*5;
        }
        System.out.println(ans);
    }
}
