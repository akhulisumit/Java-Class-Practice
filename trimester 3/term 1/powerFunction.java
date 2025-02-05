public class powerFunction {
    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if (C == 1) return 0;
        if (B == 0) return 1 % C;

        long halfPower = pow(A, B/2, C);
        long result = (halfPower*halfPower)%C;

        if(B%2!=0){
            result = (result*(A%C))%C;
        }

        return (int)((result+C)%C);
    }   
}
