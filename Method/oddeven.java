import java.util.Scanner;
class EvenOdd
{
	public static void evan()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc .nextInt();
		if(num%2==0)
		{
			System.out.println("evan number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
	public static void main(String args[])
	{
	EvenOdd();
	}
}