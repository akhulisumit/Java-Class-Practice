import java.util.ArrayList;
public class Tower_Of_Hanoi {
    public int[][] towerOfHanoi(int A) {
        ArrayList<int[]> moves = new ArrayList<>();
        solveHanoi (A, 1, 3, 2, moves);
        int[][] result = new int[moves.size()][3];
        for(int i = 0; i<moves.size(); i++){
            result[i]=moves.get(i);
        }
        return result;
    }

    private void solveHanoi(int n, int from, int to, int aux, ArrayList<int[]> moves){
        if(n==0) return;

        solveHanoi(n-1, from, aux, to, moves);
        moves.add(new int[]{n, from, to});
        solveHanoi(n-1, aux, to, from, moves);
    }
}
