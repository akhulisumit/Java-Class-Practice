public class sortedOrNot2 {
    static boolean sort(int[] arr){
        boolean sorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,6,8,9,10};
        sort(arr);
        System.out.println(sort(arr));
    }
}
