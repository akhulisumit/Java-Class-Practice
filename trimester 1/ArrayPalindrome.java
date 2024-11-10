import java.util.*;;
public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];

        for (int i = 0; i < n; i++) {
            Array[i] = sc.nextInt();
        }

        int i = 0;
        int j = n-1;
        boolean isPalindrome = true;
        while (i<j) {
            if(Array[i] != Array[j]){
                isPalindrome = false;
                break;
            }
            i++;    
            j--;
        }

        if(isPalindrome){
            System.out.println("Yes, it is a Palindrome");
        }
        else{
            System.out.println("No, its not a palindrome");
        }
        sc.close();
    }
}
