import java.util.Scanner;

public class J06SwappingTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("before swapping");
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        int temp = first;
        first = second;
        second = temp;
        System.out.println("after swapping");
        System.out.println("first number: " + first);
        System.out.println("second number: " + second);

    }

}


