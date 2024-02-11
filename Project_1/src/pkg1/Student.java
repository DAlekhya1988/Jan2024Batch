package pkg1;

public class Student {

	int rollno;
	int age;
		public void display1()
		{
			System.out.println("welcome to all of you");		
		}
	public void display2()
	{
		System.out.println("Automation is very Easy");
	}
	 public static void main(String[] args)
	 {
		 Student abc=new Student();
		 abc.rollno=501;
		 System.out.println("Student abc rollno is: "+abc.rollno);
		 abc.age=36;
		 System.out.println("Student abc age is: "+abc.age);
		 abc.display1();
		 abc.display2();
	  }
	}	
	
