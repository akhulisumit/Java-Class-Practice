import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println(array[1]);
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int sum = 0;;
        for (int i = 0; i<n; i++){
            sum = sum+array[i];
        }
        System.out.println(sum);
        sc.close();

    }
}
