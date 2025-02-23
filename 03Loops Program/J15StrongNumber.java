import java.util.Scanner;
class StrongNumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Strong Number : ");
		int n = input.nextInt();
		int i, n1, s1=0,j;  
		int fact; 
		n1 = n; 
		for(j=n;j>0;j=j/10) 
		{  	  
			fact = 1;  
			for(i=1; i<=j % 10; i++)  
			{  
				fact = fact * i;  
			}  
			 s1 = s1 + fact;  	 
		}
		if(s1==n1)  
		{  
			System.out.print("Strong Number :"+ n1);  
		}
		else  
		{  
			System.out.print("Not Strong Number :"+n1);  
		}
	}
}
