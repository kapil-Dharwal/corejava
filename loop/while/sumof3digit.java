import java.util.Scanner;
class SumofThree
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int r,sum=0,n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("sum="+sum);
	}
}