import java.util.Scanner;
class J05printEvenNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Number of Limit : ");
		int l =input.nextInt();
		for(int s=1;s<=l;s++)
		{
			if(s%2==0)
				System.out.println(s);
		}
	}
}
