import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[x];
        
        for (int i = 0; i<x; i++){
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i<x; i++){
            for(int j = i+1; j<x; j++){
                if(i!=j && array[i]+array[j]==y){    
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
