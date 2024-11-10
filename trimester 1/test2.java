import java.util.*;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%2==0){
            a=a+1;
            while (a<=b) {
                System.out.println(a);
                a=a+2;                
            }
        }
        else{
            while (a<=b) {
                System.out.println(a);
                a=a+2;                
            }
        }
        sc.close();
    }
}
