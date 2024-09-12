import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int x = sc.nextInt();
        if(x>0){
                while (x>0) {
                int digit = x%10;
                sum= sum+digit;
                x=x/10;           
            }
        }
        else if(x<0){
            x=-x;
            while (x>0) {
                int digit = x%10;
                sum= sum+digit;
                x=x/10;           
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
