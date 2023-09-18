import java.util.Scanner;
class Nagativepossi
{
	public static void positiv()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc .nextInt();
		if(num<0)
		{
			System.out.println("nagetiv number");
		}
		else
		{
			System.out.println("positive number");
		}
	}
	public static void main(String args[])
	{
		Nagativepossi ob=new Nagativepossi();
		ob.positiv();
	}
}