public class test40 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        s.length();
        for(int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
            System.out.print((int)s.charAt(i) + " ");
            System.out.print(S.charAt(i)+" ");
            System.out.println((int)S.charAt(i));
        }
    }
}
