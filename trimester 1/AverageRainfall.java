import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        } 
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + array[i];   
        }
        double Average = sum/n;
        int round = (int)Math.floor(Average);
        System.out.println(round);
        sc.close();
    }
}
