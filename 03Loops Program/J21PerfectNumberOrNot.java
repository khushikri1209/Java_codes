import java.util.Scanner;
public class J21PerfectNumberOrNot 
    { 
        static boolean Check_Perfect(int n) 
        {  
            if (n == 1) 
                return false;
            int sum = 1;
            for (int i = 2; i < n; i++) { 
     
                if (n % i == 0) { 
                    sum += i; 
                } 			
            }
            if (sum == n) 
                return true; 
     
            return false; 
        } 
     
        public static void main(String[] args) 
        { 
            Scanner input = new Scanner(System.in);		
            System.out.print("Enter The Number : ");
            int n = input.nextInt();
            if (Check_Perfect(n)) 
                System.out.println(n + " is a Perfect Number"); 
            else
                System.out.println(n + " is not a Perfect Number"); 
        } 
    }
     

