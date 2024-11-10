import java.util.*;
public class prime2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int fact = 1;
    int count = 0;
    while (fact<=x) {
        if(x%fact==0){
            count++;
        }
        if(count>2){
            break;
        }
        fact = fact+1;       
        } 
    
    if (count ==2){
        System.out.println("prime");
    }
    else{
        System.out.println("not-prime");
    }
    sc.close();
}
}
