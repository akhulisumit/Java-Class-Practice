import java.util.Scanner;

public class test22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=i; j++){
                if(j%2==1){
                    System.out.print(j);
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
