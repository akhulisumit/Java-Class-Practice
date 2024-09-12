import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long factorial = 1;
        for (long i = x; i>0;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        sc.close();
    }
}
