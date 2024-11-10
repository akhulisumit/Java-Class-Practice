import java.util.*;
public class sameArrayCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array 1: ");
        int n = sc.nextInt();
        int[] array1 = new int[n];
       
        for (int i = 0; i<n; i++){
            System.out.print("Enter the element " + (i+1) + " of array 1 : ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array 2 : ");
        int m = sc.nextInt();
        int[] array2 = new int[m];

        for (int i = 0; i<m; i++){
            System.out.print("Enter the element " + (i+1) + " of array 2 : ");

            array2[i] = sc.nextInt();
        }

        boolean isSame = true;
        for (int i = 0; i<n; i++){  
            if(array1[i]!=array2[i]){
                isSame = false;
                break;    
            }
            else{
                isSame = true;
            }
        }

        if(isSame){
            System.out.println("Both the arrays are same");
        }
        else{
            System.out.println("The arrays are not similar");
        }
        sc.close();
    }
}
