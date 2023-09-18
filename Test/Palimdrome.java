import java.lang.String;
import java.util.Scanner;
class Palimdrom
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n=sc.nextInt();
		int temp=n,rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println(n+ "  is palindrome ");
		}
		else
		{
			System.out.println(n+ "  is not palindrome");
		}
	}
}