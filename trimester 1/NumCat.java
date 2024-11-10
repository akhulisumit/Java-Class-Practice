import java.util.*;
public class NumCat {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int a = x%10; 
       x = x/10;
       int b = x%10;
       x = x/10;
       int c =  x%10;
       if(a%2==0&&b%2==0&&c%2==0){
        System.out.println("C1");
       }

       else if ((a%2==0&&b%2==0)){
        System.out.println("C2");
       }
       
       else if ((a%2==0&&b%2!=0&&c%2!=0)||(a%2!=0&&b%2==0&&c%2!=0)||(a%2==0&&b%2!=0&&c%2!=0)){
        System.out.println("C3");
       }

       
       else if (a%2==1&&b%2==1&&c%2==1){
        System.out.println("C4");
       }
       sc.close();

    }    
}
