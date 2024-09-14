import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
        }
        int i = 0; 
        int j = n-1;
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k <n; k++){ 
            System.out.print(array[k] + " ");
        }

        sc.close();    
    }
}
