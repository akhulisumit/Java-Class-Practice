import java.util.*;
class hello{
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

                if (input1>=input2 && input1>=input3 && input1>=input4){
                        System.out.print(input1+ " is the greater amoung these three numbers");
                }
                else if (input2>=input3 && input2>=input1 && input3>=input4){
                        System.out.print(input2+ " is the greater amoung these three numbers");
                }
                else if (input3>=input2 && input3>=input1 && input3>=input4){
                        System.out.print(input3+ " is the greater amoung these three numbers");
                }
                else if (input4>=input2 && input4>=input1 && input4>=input3){
                        System.out.print(input4+ " is the greater amoung these three numbers");
                }

                else if (input3==input2 && input3==input1){
                        System.out.print("All are equal");
                }
                sc.close();

        }
}

