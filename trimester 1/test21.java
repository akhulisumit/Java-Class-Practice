import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0; i<a; i++){
            array[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int z = sc.nextInt();
        for(int i = 0; i<x-1; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print(z+" ");
        for(int i = x-1; i<a; i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}
