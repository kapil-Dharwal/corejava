import java.util.Scanner;
class Addition
{
	private int a,b;
	public void setData(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public int addition()
	{
		int c=this.a+this.b;
		return c;
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a=sc.nextInt();
		System.out.println("Enter value of b :");
		int b=sc.nextInt();
		Modulues ob=new Modulues();
		ob.setData(a,b);
		int c=ob.getData();
		System.out.println("addition="+c);
	}
}