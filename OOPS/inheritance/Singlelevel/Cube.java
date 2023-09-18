import java.util.Scanner;
class Cube
{
	int i,n;
	public void setData(int i,int n)
	{
		this.i=i;
		this.n=n;
	}
	public int cube()
	{
		return this.i*this.i*this.i;
	}
}
class Factorial extends Cube
{
	private int f ;
	public void setData(int i,int f,int n)
	{
		this.setData(i,n);
		this.f=f;
	}
	public int fact()
	{
		for( i=1,f=1;i<=this.n;f=f*i,i++);
		
		return f;
	}
}
class TestMain
{
	public static void main(String args[])
	{
		Factorial ob = new Factorial();
		ob.setData(6,6);
		System.out.println("Cube="+ob.cube());
		System.out.println("Factorial="+ob.fact());
	}
}