import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            int c = 1;
            for(int j = 1; j<=i; j++){
                if(j%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(c);
                    c++;
                }
            }
            System.out.println();
        }
    }
}
