import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();
        long volume = length*width*height;
        if(length >= 10000 || width >= 10000 || height >= 10000 || mass >= 100 || volume >= 1000000000){
            System.out.println("Both");
        }
        if(length >= 10000 || width >= 10000 || height >= 10000  || volume >= 1000000000){
            System.out.println("Bulky");
        }
        else if (mass>= 1000){
            System.out.println("Heavy");
        }
        else{
            System.out.println("Neither");
        }
        sc.close();
    }
}
