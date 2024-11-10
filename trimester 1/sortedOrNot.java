import java.util.Arrays;
public class sortedOrNot {
    static boolean sort(int[] arr, int[] arrSorted) {
        boolean sorted = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != arrSorted[i]) {
                sorted = false;
                break;
            }
        }
        return sorted;

    }
     
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,8,9,10};
        int[] arrSorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrSorted);
        boolean isSorted = sort(arr, arrSorted);
        System.out.println(isSorted);
    
    }
}
