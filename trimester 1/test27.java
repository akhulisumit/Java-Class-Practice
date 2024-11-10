public class test27 {

    static int sum(int a, int b) {
        int c = a+b;
        return c;
    }

    static int firstValue(int[] A){
        A[0] = 100;
        return A[0];
    }
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(sum(a,b));
        System.out.println(b);
        int[] A = {2, 3};
        System.out.println(firstValue(A));
        System.out.println(A[0]);
        System.out.println(A);
    }
}
