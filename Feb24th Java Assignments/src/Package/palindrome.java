package Package;
import java.util.Scanner;
public class palindrome 
{
	static int reversNumber(int n)
    {
        int reversed_n = 0;
        
		while (n > 0) {
            reversed_n = reversed_n * 10 + n % 10;
            n = n / 10;
        }
        return reversed_n;
    }
	public static void main(String[] args) 
	{
		Scanner n = new Scanner(System.in); 
		System.out.print("Enter a number : "); 
		int num = n.nextInt();
		int reverseN = reversNumber(num);
		//int num1 = Integer.parseInt(num.nextLine());
		
		if (num == reverseN)
		{  
	           System.out.println("palindrome");  
	    } 
		else 
	       {  
	           System.out.println(n + " is not a palindrome");  
	       }  
	   }
		}