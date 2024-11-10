import java.util.*;
public class test1 {
    public static void main(String[] args) {
        
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt(); 
           int k = sc.nextInt();
		if(k<n && k>=0){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
		sc.close();
    }    
}

