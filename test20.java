import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for(int i = 0; i<n; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(max-min);
        sc.close();
    }
}
