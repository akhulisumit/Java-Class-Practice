import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        for (long i = 1; i<=a; i++){
            int b = sc.nextInt();
            long[] array = new long[b];
            for (int k = 0; k< b; k++){
                array[k] = sc.nextLong();
            }

            List<Long> oddList = new ArrayList<>();
            List<Long> evenList = new ArrayList<>();


            for (int j = 0; j<b; j++){
                if(array[j]%2==1){
                    oddList.add(array[j]);
                }
                else{
                    evenList.add(array[j]);
                }
            }

            for(Long odd : oddList){
                System.out.print(odd+" ");
            }
            System.out.println();

            for(Long even : evenList){
                System.out.print(even+" ");
            }
            System.out.println();
        }
    }
}