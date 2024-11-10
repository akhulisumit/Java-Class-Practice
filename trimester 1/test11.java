import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (char i = 1; i<=x; i++){
            char currentChar = (char) ('A' + i - 1);
            for(char j = 1; j<=i; j++){
                System.out.print(currentChar+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
