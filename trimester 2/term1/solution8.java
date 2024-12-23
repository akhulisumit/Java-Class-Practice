public class solution8 {
    public int solve(String A) {
        int mod = 1000000007;
        int countA = 0;
        int countAG = 0;
 
        for(int i = 0; i<A.length(); i++){
            char c = A.charAt(i);
            if(c == 'A'){
                countA++;
            }
            else if(c == 'G'){
                countAG = (countAG + countA)%mod;
            }
        }
 
        return (int) countAG;
 
     }
}
