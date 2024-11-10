import java.lang.*;
import java.util.*;

public class secondLargest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        if (n < 2) {
            System.out.println("NA");
            return;
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("NA");
        } else {
            System.out.println(secondMax);
        }
        sc.close();
    }
}