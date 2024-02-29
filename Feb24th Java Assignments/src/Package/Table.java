package Package;

import java.util.Scanner;

public class Table {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter a number : ");  
		int n = s.nextInt();  
		int i;
		
		for(i=1;i<=10;i++)
		{  
			System.out.println(n+"*"+i+"="+n*i);  
		}  

	}
}
