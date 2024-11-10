import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=(2*a)-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(4*a)-((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = a; i>0; i--){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(4*a)-((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = a; i>0; i--){
            for(int j = 1; j<=(2*a)-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
