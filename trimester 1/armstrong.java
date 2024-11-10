import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            int num = i;
            int sum = 0;
            for (int x = num; x>0; x=x/10){
                int digit = x%10;
                sum = sum + digit*digit*digit;
            }
            if (sum==num){
                System.out.println(num);
            }
            // int num = i;
            // int digit = i%10;
            // int a = digit;
            // i = i/10;
            // digit = i%10;
            // int b = digit;
            // i = i/10;
            // digit = i%10;
            // int c = digit;
            // if (a*a*a+b*b*b+c*c*c==num){
            //     System.out.println(num);
            // }
        }
        sc.close();
    }
}
