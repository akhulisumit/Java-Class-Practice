import java.util.*;
class greater{
        public static void main (String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Input 1: ");
                int input1 = sc.nextInt();
                System.out.print("Enter Input 2: ");
                int input2 = sc.nextInt();
                System.out.print("Enter Input 3: ");
                int input3 = sc.nextInt();
                System.out.print("Enter Input 4: ");
                int input4 = sc.nextInt();

                int max=input1;

		if(input2>=max){
			max =input2;
		}
		if(input3>=max){
                        max =input3;
                }
		if(input4>=max){
                        max =input4;
                }
		System.out.print(max + " is the greatest");
                sc.close();
	}
}
