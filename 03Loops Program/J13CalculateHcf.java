import java.util.Scanner;
class Calculatehcf
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
 
		System.out.print("Enter the First Number :");
		int dividend = input.nextInt();        
		System.out.print("Enter the Second Number :");
		int divisor = input.nextInt();
		int rem, hcf = 0;
		do
		{
			rem = dividend % divisor;
 
			if(rem == 0)
			{
				hcf = divisor;
			}
			else
			{
				dividend = divisor;
				divisor = rem;
			}
 
		}while(rem != 0);
 
		System.out.println("HCF : " + hcf);
    }  
}

