import java.util.Scanner;

public class test25 {

    static long factorial(int n){
        long factorial = 1;
        for (int i = 1; i<=n;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
