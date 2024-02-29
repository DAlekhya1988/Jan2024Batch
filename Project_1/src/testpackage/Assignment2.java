package testpackage;
//((((10/2)-2)+2)-2)/2)
public class Assignment2 
{
  public int div(int a,int b)
  {
	 return(a/b);
  }
  public int sub(int a, int b)
  {
	  return(a-b);
  }
  public int add(int a,int b)
  {
	  return a+b;
  }
  	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Assignment2 exp=new Assignment2();
int div=exp.div(10, 2);
int sub=exp.sub(div, 2);
int add=exp.add(sub, 2);
int sub2=exp.sub(add, 2);
int div2=exp.div(sub2, 2);
System.out.print("The result is:"+div2);
	}

}
