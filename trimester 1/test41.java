import java.util.Scanner;
import java.util.*;

public class test41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ts = "";
        for(int i = 0; i<=s.length()-1; i++){

            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                ts = ts+(c-32);
               
            }
            else if(c>='A' && c<='Z'){
                ts = ts+(c-32);
            }
            
        }
        System.out.println(ts.toString());
        sc.close();
    }
}
