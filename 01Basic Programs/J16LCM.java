public class J16Lcm {
    import java.util.Scanner;

public class J19LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();
        int HCF = 1;
        int LCM = 1;
        for (int i = 1; n1 <= i && n2 <= i; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                HCF = i;
            }
        }
        LCM = (n1 * n2) / HCF;
        System.out.println("LCM is " + LCM);

    }

}

    
}
