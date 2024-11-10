import java.util.*;;
public class SumofReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num = 0;
        if(x>0){
            while (x>0) {
                int digit = x%10;
                num = num *10+digit;
                x=x/10; 
            }
        }
        else{
            x = -x;
            while (x>0) {
                int digit = x%10;
                num = num *10+digit;
                x=x/10; 
            }
            num = -num;
        }
        int result = num*2;
        System.out.println(result);
        sc.close();
    }
}
