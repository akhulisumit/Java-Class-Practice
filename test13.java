import java.util.*;

public class test13 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); 
            int countOdd = 0;
            int countEven = 0;

            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }

            System.out.println(Math.abs(countEven - countOdd));
        }
        sc.close();
    }
}