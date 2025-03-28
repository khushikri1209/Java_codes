import java.util.Scanner;
class HexadecimalToOctal
{
public static void main(String[] args)
{		
	Scanner input = new Scanner(System.in);
    System.out.print("Enter Hexdecimal Number : ");
	String hex = input.nextLine();
	int dec = 0;
	int c = hex.length() - 1;
	for(int i = 0; i < hex.length() ; i ++ )
	{
		char ch = hex.charAt(i);
		switch (ch)
		{
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				dec = dec + Integer.parseInt(Character.toString(ch))*(int)Math.pow(16,c);
				c--;
				break;
			case 'a':
			case 'A':
				dec = dec + 10 * (int)Math.pow(16, c);
				c--;
				break;
			case 'b':
			case 'B':
				dec = dec + 11 * (int)Math.pow(16, c);
				c--;
				break;
			case 'c':
			case 'C':
				dec = dec + 12 * (int)Math.pow(16, c);
				c--;
				break;
			case 'd':
			case 'D':
				dec = dec + 13 * (int)Math.pow(16, c);
				c--;
				break;
			case 'e':
			case 'E':
				dec = dec + 14 * (int)Math.pow(16, c);
				c--;
				break;
			case 'f':
			case 'F':
				dec = dec + 15 * (int)Math.pow(16, c);
				c--;
				break;
			default:
				System.out.println("Invalid Hexdecimal Number");
				break;
		}
	}
 
	String oct ="";
	while(dec > 0)
	{
		oct = dec % 8 + oct;
		dec = dec / 8;
	}
 
	System.out.println("Hexdecimal Number : "+hex);
	System.out.println("Octal Number : "+oct);
}
}

