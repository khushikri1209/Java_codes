import java.util.Scanner;

public class J07MultipleTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }

}

