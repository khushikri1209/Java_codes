import java.util.Scanner;
class J09Checktriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Three Sides of Triangle :");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		if(side1 == side2 && side2 == side3)
			System.out.println("Equilateral Triangle.");
		else if(side1 == side2 || side1 == side3 || side2 == side3)
			System.out.println("Isosceles Triangle.");
		else 
			System.out.println("Scalene Triangle.");
	}
}

