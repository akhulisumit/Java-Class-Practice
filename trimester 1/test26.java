public class test26 {
    static int maxOfTwo(int a, int b) {
        if(a>b) {
            return a;
        }
        return b;
    }
    static int maxOfThree(int a, int b, int c) {
        if(a>=b && a>=c) {
            return a;
        }
        else if(b>=a && b>=c) {
            return b;
        }
        return c;
    }
    static int maxOfAll(int [] array) {
        int max = array[0];
        for(int i = 1; i<array.length; i++) {
            max = maxOfTwo(max, array[i]);
        }
        return max;
    }
}
