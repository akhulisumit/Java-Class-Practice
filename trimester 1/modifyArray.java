import java.util.Arrays;
public class modifyArray {

    static void modifyArray(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {

            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,9,10};
        modifyArray(arr);
        System.out.println(Arrays.toString(arr));
    
    }
}
