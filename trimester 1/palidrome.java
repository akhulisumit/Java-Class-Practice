import java.util.*;;

public class palidrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int original = x;
        int num = 0;
        if(x>0){
            while (x>0) {
                int digit = x%10;
                num = num *10+digit;
                x=x/10; 
            }
        }
        if(num==original){
            System.out.println("Its is a Palidrome");
        }
        else{
            System.out.println("not a plaidrome");
        }
        sc.close();
    }
}

