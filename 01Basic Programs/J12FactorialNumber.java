
import java.util.Scanner;

public class J12FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial");
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.println("factorial is: " + factorial);
    }

}

