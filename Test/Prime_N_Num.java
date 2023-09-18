import java.lang.String;
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number:");
		int num;
		int temp=0;
		num=sc.nextInt();
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
		
	}
}