import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int count = 0;
        while (x>0) {
            int div = x/2;
            x = div;
            count++;
        }
        System.out.println(count-1);
        sc.close();
    }
}
