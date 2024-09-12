import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long count = 0;
        for (long i = x; i>0; i--){
            if(i % 25 == 0){
                count = count+2;
            }
            else if(i%5==0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
