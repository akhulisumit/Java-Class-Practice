import java.util.*;
public class fizzbuzz{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a%3==0&&a%5==0){
			System.out.print("fizz-buzz");
		}
		else if (a%3==0){
                        System.out.print("fizz");
                }
		else if (a%5==0){
                        System.out.print("buzz");
                }
		sc.close();
	}
}
