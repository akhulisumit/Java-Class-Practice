import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
       
        for (long fact = 1; fact*fact<=a; fact++){
            if(a%fact==0){
                System.out.println(fact);
                System.out.println(a/fact);
            }
        }
        sc.close();
    }
}
