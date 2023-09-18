import java.util.Scanner;
class Student
{
	int rno;
	String name;
	
	public Student(){}
	public Student(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Roll="+this.rno);
		System.out.println("Name="+this.name);
	} 	
}
interface Extra
{
	int total();
}
class Marks extends Student
{
	int p,c,m;
	public Marks (){}
	public Marks (int p,int c,int m,int rno,String name)
	{
		super (rno,name );
		this.p=p;
		this.c=c;
		this.m=m;
	}
	public void display()
	{
		super.display();
		System.out.println("Phy="+this.p);
		System.out.println("Che="+this.c);
		System.out.println("Math="+this.m);
	}
}
class Result extends Marks implements Extra
{
	public Result(){}
	public  Result (int p,int c,int m,int rno,String name)
	{
		super(p,c,m,rno,name);
	}
	public int total()
	{
		return this.p+this.c+this.m;
	}
	public void display()
	{
		super.display();
	}
	public double percentage(int tot)
	{
		double per=tot/3.0;
		return per;
	}
}
	 class Studentclient
	{
		public static void main(String[]args)
		{
			Result ob=new Result(67,54,88,101,"kamal");
			ob.display();
			int tot=ob.total();
			double per=ob.percentage(tot);
			
			System.out.println("Total marks="+tot);
			System.out.println("Percentage="+per);
		}
	}