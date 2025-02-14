import java.util.Scanner;

public class J14FibonacchiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of terms: ");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm + "  " + secondTerm + "  ");
        int current;
        for (int i = 0; i <= n; i++) {
            current = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = current;
            System.out.print(current + "  ");

        }
    }

}

    
