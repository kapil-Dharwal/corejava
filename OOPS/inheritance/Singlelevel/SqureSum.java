import java.util.Scanner;
class Square
{
	int a;
	public Square(int ab){
		a = ab;
	}

	public void setData(int a)
	{
		this.a=a;
	}
	public int sq()
	{
		return this.a*this.a;
	}
}
class Addition extends Square
{
	private int b;
	public void setData(int a,int b)
	{
		this.setData(a);
		this.b=b;
	}
	public int add()
	{
		return this.a+this.b;
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Addition ob = new Addition();
		ob.setData(5,7);
		System.out.println("Square="+ob.sq());
		System.out.println("Addition="+ob.add());
	}
}