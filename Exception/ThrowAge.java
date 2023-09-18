import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
class Vote
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		
		int age=sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new YoungerAgeException("You are not eligible for vote");
			}
			else if
		}
		catch(Exception e)
		{
			System.out.println("you can vote");
		}
	}
}