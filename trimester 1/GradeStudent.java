import java.util.Scanner;

public class GradeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<=5; i++){
            sum = sum + marks[i];
        }
        sc.close();

    }
}
