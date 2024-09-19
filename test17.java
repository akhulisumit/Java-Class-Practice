import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int [n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(i!=j && i!=k && j!=k &&(array[i]+array[j]+array[k])%2==0){
                        count++;
                    }
                }    
            }
        }
        System.out.println(count);
        sc.close();

    }
}
