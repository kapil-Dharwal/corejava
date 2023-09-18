//leap year
import java.util.Scanner;
class Leap
{
	private int year;
	
	public void setData(int year)
	{
		this.year = year;
	}
	public int getData()
	{
		return this.year;
	}
	public void checkLeap()
	{
		//logic
		if((this.year%4==0 && this.year!=100)||this.year%100==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not Leap year");
		}
	}
	
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Leap ob = new Leap();
		System.out.println("Enter a year");
		int year = sc.nextInt();
		ob.setData(year);
		System.out.println(ob.getData());
		ob.checkLeap();
	}
}
