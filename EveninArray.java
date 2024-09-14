import java.util.*;
public class EveninArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of your array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i<n; i++){
            System.out.print("Enter the element " + (i+1) + " : ");
            array[i] = sc.nextInt();
        } 
        int count = 0;
        for (int i = 0; i<n; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
