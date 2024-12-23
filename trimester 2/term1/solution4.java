public class solution4 {
    public int[] solve(int[] A) {
        int N = A.length;
        // List to store the leaders, we use an ArrayList for dynamic size
        java.util.ArrayList<Integer> leadersList = new java.util.ArrayList<>();
        
        // The rightmost element is always a leader
        int maxRight = A[N - 1];
        leadersList.add(maxRight);
        
        // Traverse the array from right to left
        for (int i = N - 2; i >= 0; i--) {
            if (A[i] > maxRight) {
                leadersList.add(A[i]);
                maxRight = A[i];
            }
        }
        
        // Convert the leadersList to an array
        int[] leaders = new int[leadersList.size()];
        for (int i = 0; i < leadersList.size(); i++) {
            leaders[i] = leadersList.get(i);
        }
        
        // Reverse the array to maintain the left to right order of leaders
        for (int i = 0; i < leaders.length / 2; i++) {
            int temp = leaders[i];
            leaders[i] = leaders[leaders.length - 1 - i];
            leaders[leaders.length - 1 - i] = temp;
        }
        
        return leaders;
    }
}
