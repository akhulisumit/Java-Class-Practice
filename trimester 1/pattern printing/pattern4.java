import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i<=a; i++){
            for(int j = 1; j<=i; j++){
                if(j%2==0){
                    System.out.print(j);
                }
                else{
                    System.out.print("*");
                }
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
