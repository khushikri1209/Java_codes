import java.util.Scanner;

class J10AbsoluteValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number :");
		int num = input.nextInt();
		if (num < 0)
			num = (-1) * num;
		System.out.print("Absolute Number is : " + num);
	}
}