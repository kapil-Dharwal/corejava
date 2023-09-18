import java.util.Scanner;
class Fact
{
	public static void main(String[]args)
	{
		
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num:");
		int fact=1,i=1,n;
		n=sc.nextInt();
		do
		{
			fact=fact*i;
			i++;
		}
		while(i<=n);
		{
			System.out.print("factorial ="+fact);
		}
	}
}

	