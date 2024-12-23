import java.util.Scanner;

public class addInQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of Queries: ");
        int Q = sc.nextInt();

        int[] arr = { 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0};
        int n = arr.length;

        while(Q-->0){
            System.out.print("Starting index: ");
            int index = sc.nextInt();
            System.out.print("The value to be added: ");
            int value = sc.nextInt();
            for(int i = index; i<n; i++){
                arr[i] = arr[i] + value;
            }
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
