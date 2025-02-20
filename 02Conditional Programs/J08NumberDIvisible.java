import java.util.Scanner;
class J08numberDivisible
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number  : ");
		int num = input.nextInt();
		if(num%5==0 && num%11==0)
			System.out.println("This Number is Divisible by 5 and 11");
		else
			System.out.println("This Number is Not Divisible by 5 and 11");
	}
}