import java.util.Scanner;
public class J12MaxtwoNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter the Number2 : ");
		int num2 = input.nextInt();
		if(num1>num2)
			System.out.println("Maximum Number is " +num1);
		else if(num1<num2)
			System.out.println("Maximum Number is " +num2);
		else
			System.out.println("Both are Equal " +num1);
	}
}