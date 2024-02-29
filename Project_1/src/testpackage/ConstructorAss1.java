package testpackage;

public class ConstructorAss1 
{
     public ConstructorAss1() 
 	{
    	this(12,23,67);
 		System.out.println("Default Constructor");
 	}
     public ConstructorAss1(int a)
     {
     	 this();   	
    	 System.out.println("This is a one parameterized constructor");
     }
	   public ConstructorAss1(int a,int b)
	{
		this(34);   
		System.out.println("This is a two parameterized constructor");
	}
	   public ConstructorAss1(int a,int b, int c, int d)
	   {
		   this(1,2);
		   System.out.println("This is a Four parameterized constructor");
	   }
	
	public ConstructorAss1(int i, int j, int k) 
	{
		System.out.println("This is three parameterized constructor");
	}
	public static void main(String[] args) 
	{
	  ConstructorAss1 ob=new ConstructorAss1(200,220,260,280);
	}

}
