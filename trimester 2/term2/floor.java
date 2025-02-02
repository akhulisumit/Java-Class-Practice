public class floor {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 11, 14, 19, 20, 23, 25 };
        int n = arr.length;
        int target = 12;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(mid + " " + arr[mid]);
                return;
            } else if (arr[mid] > target) {  
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = arr[mid];
            }
        }
        if (ans != -1) {
            System.out.println("Floor value: " + ans);
        }
    }
}

