import java.util.Scanner;
public class test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            int num = array[i];
            int sum = 0;
            while (num>0) {
                int digit = num%10;
                sum = sum + digit;
                num = num/10;
            }
            array2[i] = sum;            
        } 
        int min = array2[0];
        for (int i = 0; i < n; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        System.out.println(min);

    }
}

