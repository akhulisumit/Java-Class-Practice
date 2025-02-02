public class Solution {
    public int[] dNums(int[] A, int B) {
        int n = A.length;
        if(B>n){
            return new int [0];
        }

        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int i = 0; i<B; i++){
            freqMap.put(A[i], freqMap.getOrDefault(A[i], 0)+1);
        }

        result.add(freqMap.size());

        for(int i = B; i<n; i++){
            int getOutElement = A[i-B];
            freqMap.put(getOutElement, freqMap.get(getOutElement)-1);
            if(freqMap.get(getOutElement)==0){
                freqMap.remove(getOutElement);
            }

            int getInElement = A[i];
            freqMap.put(getInElement, freqMap.getOrDefault(A[i], 0)+1);

            result.add(freqMap.size());
        }

        int[] output = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            output[i] = result.get(i);
        }
        return output;
    }
}
