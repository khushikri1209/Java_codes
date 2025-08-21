//check positive or Negative number
import java.util.Scanner;

public class J01Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number:  ");
        int input = sc.nextInt();

        // condition
        if (input > 0) {
            System.out.println("number is positive");
        } else if (input < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
