//Even Odd 
import java.util.Scanner;
class EvenOdd
{
	private int n;
	
	public void setData(int n)
	{
		this.n = n;
	}
	public int getData()
	{
		return this.n;
	}
	public void checEvenOdd()
	{
		//logic
		if(this.n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd number");
		}	
	}
	
}
class Test
{
	public int getInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		return n;
	}
	
	public static void main(String []args)
	{	
		EvenOdd ob = new EvenOdd();
		Test ob1 = new Test();
		ob.setData(ob1.getInput());
		//System.out.println(ob.getData());
		ob.checEvenOdd();
	}
}
