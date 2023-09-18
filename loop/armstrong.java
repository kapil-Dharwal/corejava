import java.util.Scanner;
class Armstrong
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int sum=0,r=0,n=sc.nextInt();
		int tem=n;
		while(n>0)
		{
			r=n%10;
			sum+=(r*r*r);
			n/=10;
		}
		if(tem==sum)
		{
			System.out.println("Enter number is Armstrong");
		}
		else
		{
			System.out.println(" Enter number is not Armstrong");
		}
     
	}
}