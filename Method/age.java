import java.util.Scanner;
class Age
{
	public static void vote()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age");
		int age = sc .nextInt();
			if(age>=18)
			{
				System.out.println("iligible for vot");

			}
			else
			{
				System.out.println("not iligible for vot");
			}
	}
	public static void main(String args[])
	{
		Age ob=new Age();
		ob.vote();
	}
}