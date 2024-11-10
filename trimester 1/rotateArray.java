import java.util.Arrays;
public class rotateArray {

    static void rotate(int[] arr, int d) {
        for(int j = 1; j<=d; j++) {
            int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {

            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        }
    }
        
    public static void main(String[] args) {
        int d = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        rotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }    
}
