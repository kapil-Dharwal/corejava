import java.util.Scanner;
class Revers
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int rev=0,rem=0,n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Revers number="+rev);
	}
}