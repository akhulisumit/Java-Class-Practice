import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            System.out.print("*");
            for(int j = 1; j<=(a-1); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
