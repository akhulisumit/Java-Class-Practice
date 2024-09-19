import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] array = new int[x];
        
        for (int i = 0; i<x; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i<x; i++){
            boolean b = false;
            for(int j = 0; j<x; j++){
                if(i!=j){
                    if(array[i]==array[j]){                       
                        b = true;
                    }
                }
            }
            if(!b){
                System.out.print(array[i]+" ");
            }
        }   
        sc.close();     
    }
}
