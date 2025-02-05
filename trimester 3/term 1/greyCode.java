import java.util.ArrayList;

public class greyCode {
    public int[] grayCode(int A) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);

        for(int i = 0; i<A; i++){
            int size = result.size();
            for(int j = size-1; j>=0; j--){
                result.add(result.get(j) |(1<<i));
            }
        }

        int[] greyCode = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            greyCode[i] = result.get(i);
        }

        return greyCode;
    }
}
