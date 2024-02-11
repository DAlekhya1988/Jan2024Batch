package pkg1;

public class ConstAssign2 
{
    public void Method1()
    {
    	System.out.println("Default Method");
    	this.Method1(3);
    }
	private void Method1(int i) 
	{
		System.out.println("One Parameterized Method");
		this.Method2(29, 56);
		
	}
	public void Method4(int a,int b,int c,int d) 
	{
		System.out.println("Four Parameterized Method");
		this.Method1();
	}
	public void Method2(int j,int k)
	{
		System.out.println("Two Parameterized Method");
		
	}

	public void Method3(int i, int j, int k) 
	{
		System.out.println("Three parameterized Method");
		this.Method4(87, 88, 44, 45);
	}

	public static void main(String[] args) 
	{
	ConstAssign2 obj=new ConstAssign2();
	obj.Method3(20, 90, 50);

	}

}
