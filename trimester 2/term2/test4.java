import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            while (a-->0) {
                for(int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }
                boolean Doremy = true;
                for(int i = 0; i< arr.length-2; i++) {
                    if(arr[i]+arr[i+1] != arr[i+1]+arr[i+2]) {
                        Doremy = false;
                    }
                }
                if(Doremy) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            
        }
    }
}
