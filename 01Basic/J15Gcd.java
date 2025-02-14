import java.util.Scanner;

public class J15Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 6;
        int n2 = 9;
        int HCF = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                HCF = i;
            }

        }
        System.out.println("Hcf is: " + HCF);

    }

}

