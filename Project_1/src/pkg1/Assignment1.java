package pkg1;

//(((10+2)+2)-2)*2)/2)
public class Assignment1 
{
  public int sum(int x, int y)
  {
	return (x+y);
  }
  public int substract(int x,int y)
  {
	 return (x-y);	  
  }
  public int Multiply(int x, int y)
  {
  return (x*y);
  }
  public int Divide(int x, int y)
  {
	  return(x/y);
  }
  public static void main(String args[])
  {
	  Assignment1 obj=new Assignment1();
	  int s1=obj.sum(10,2);
	  int s2=obj.sum(s1,2);
	  int s3=obj.substract(s2,2);
	  int s4=obj.Multiply(s3,2);
	  int s5=obj.Divide(s4,2);
	  System.out.println("The result is "+s5);
  }
}
