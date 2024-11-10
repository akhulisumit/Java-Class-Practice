import java.util.Scanner;
import java.util.*;

public class test42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=s.length()-1; i++){

            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                sb.append((c-32));          
            }
            else if(c>='A' && c<='Z'){
                sb.append((c+32));          
            }
            
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
