import java.lang.*;
import java.util.*;

public class test24 {

    static int sum (int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =  sum (a,b);
        System.out.println(c);
    }
}