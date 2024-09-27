import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=a-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
