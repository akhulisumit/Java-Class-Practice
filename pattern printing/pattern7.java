import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = a; i>0; i--){
            System.out.print("*");
            for(int j = i; j>0; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
