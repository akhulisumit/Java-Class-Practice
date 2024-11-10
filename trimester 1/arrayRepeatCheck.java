import java.util.*;
public class arrayRepeatCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of your array: ");
        int x = sc.nextInt();
        int[] array = new int[x];
        for (int i = 0; i<x; i++){
            System.out.print("Enter the "+ (i+1) + " element: ");
            array[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i<x; i++){
            if(array[i] == target){
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
