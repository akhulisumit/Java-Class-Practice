public class gcd {
    public int gcd(int A, int B) {
        if(B==0) return A;
        else{
            return gcd(B, A%B);
        }
    }
}
