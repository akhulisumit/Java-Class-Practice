import java.util.*;

public class check {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a;
        int evenSum = 0;
        int oddSum = 0;
        int count = 0;
        while(a>0){
            a = a/10;
            count++;
        }
        if(count%2==0){
            while(num>0){
                int digit = num%10;
                evenSum = evenSum+digit;
                num = num/10;
                digit = num%10;
                oddSum = oddSum + digit;
                num = num/10;
            }
        }
        else if(count%2==1){
            while(num>0){
                int digit = num%10;
                oddSum = oddSum + digit;
                num = num/10;
                digit = num%10;
                evenSum = evenSum+digit;
                num = num/10;
            }
        }
        //if(count%2!=1){
            System.out.println("Sum of Odd Index Digit : "+ oddSum);
            System.out.println("Sum of Even Index Digit : "+ evenSum);
        //}
        // else{
        //     System.out.println("Sum of Odd Index Digit : "+ evenSum);
        //     System.out.println("Sum of Even Index Digit : "+ oddSum);
        // }
        sc.close();
    }
}