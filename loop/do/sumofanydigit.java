import java.util.Scanner;
class Sumofanydigit
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int sum=0,r,n=sc.nextInt();
		
		do
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}while(n>0);
		System.out.println("Sum of any given digit ="+sum);
	}
}